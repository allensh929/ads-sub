package com.spdb.adsub.web.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spdb.adsub.config.Constants;
import com.spdb.adsub.service.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.*;

@RestController
@RequestMapping("/api")
public class WorkItemResource {

    private final Logger log = LoggerFactory.getLogger(AccountResource.class);

    //refer api https://docs.microsoft.com/en-us/rest/api/azure/devops/git/refs/update%20refs?view=azure-devops-rest-5.1
    //https://docs.microsoft.com/en-us/rest/api/azure/devops/git/refs/list?view=azure-devops-rest-5.1
    private String api_refs_list = "https://dev.azure.com/{0}/{1}/_apis/git/repositories/{2}/refs?filter=heads/&filterContains={3}&api-version=5.1";
    private String api_create_ref = "https://dev.azure.com/{0}/{1}/_apis/git/repositories/{2}/refs?api-version=5.1";
    // your repository_id todo change your ***
    private String repository_id = "5efe6fcf-ce6e-4a88-b69f-3bef1c379303";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * {@code POST  /work-items/create} : work item create
     *
     * @param workItemCreatedDTO work item.
     */
    @PostMapping(path = "/work-items/create")
    public ResponseEntity<CreateRefResponse> createFeatureBranchWhenWorkItemCreated(@RequestBody WorkItemCreatedDTO workItemCreatedDTO) throws JsonProcessingException {

        log.debug("************* work items created****************");
        log.debug(workItemCreatedDTO.getMessage().getText());
        // 获取master refs
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", Constants.ADS_PAT);

        log.debug("-----------start get master refs----------");
        Refs refs = getRefs(headers).getBody();
        log.debug(objectMapper.writeValueAsString(refs));
        log.debug("-----------end get master refs----------");

        if (!Optional.ofNullable(refs).isPresent() || refs.getCount() <= 0) {
            return null;
        }

        // 获取master objectId, 基于master创建feature branch
        log.debug("-------------start create new branch from master -------");
        String masterObjectId = refs.getValue().get(0).getObjectId();
        ResponseEntity<CreateRefResponse> createRefResponseResponseEntity = createRefs(headers, masterObjectId);
        // 输出日志for test
        CreateRefResponse crr = createRefResponseResponseEntity.getBody();
        if (Optional.ofNullable(crr).isPresent() && crr.getCount() > 0) {
            log.debug("create/update status:" + crr.getValue().get(0).getUpdateStatus());
            log.debug(objectMapper.writeValueAsString(crr));
        }
        log.debug("-------------end create new branch from master -------");
        return createRefResponseResponseEntity;
    }

    private ResponseEntity<Refs> getRefs(HttpHeaders headers) {
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(null, headers);
        //todo change your ***
        String getRefsUrl = MessageFormat.format(api_refs_list, "your organization", "your project", "your repository", "master");
        return restTemplate.exchange(getRefsUrl, HttpMethod.GET, requestEntity, Refs.class);
    }

    private ResponseEntity<CreateRefResponse> createRefs(HttpHeaders headers, String newObjectId) {
        // 构建req
        List<CreateRefReq> createRefReqs = new ArrayList<>();
        CreateRefReq crq = new CreateRefReq();
        crq.name = "refs/heads/feature_test" + new Random().nextInt();
        crq.newObjectId = newObjectId;
        createRefReqs.add(crq);
        //todo change your ***
        String createRefUrl = MessageFormat.format(api_create_ref, "your organization", "your project", repository_id);
        HttpEntity<List<CreateRefReq>> createRefRequestEntity = new HttpEntity<>(createRefReqs, headers);
        return restTemplate.exchange(createRefUrl, HttpMethod.POST, createRefRequestEntity, CreateRefResponse.class);
    }

    /**
     * {@code POST  /work-items/create} : work item create
     *
     * @param workItemCreatedDTO work item.
     */
    @PostMapping(path = "/work-items/delete")
    public void workItemDelete(@RequestBody WorkItemCreatedDTO workItemCreatedDTO) {
        log.debug("************* work items delete****************");
        log.debug(workItemCreatedDTO.getMessage().getText());
        log.debug(" call api to delete branch, todo");
    }

}
