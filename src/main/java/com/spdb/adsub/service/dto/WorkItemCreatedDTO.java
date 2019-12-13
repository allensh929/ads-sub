package com.spdb.adsub.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Auto-generated: 2019-12-11 13:29:50
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class WorkItemCreatedDTO {

    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @JsonProperty("notificationId")
    private int notificationId;
    private String id;
    @JsonProperty("eventType")
    private String eventType;
    @JsonProperty("publisherId")
    private String publisherId;
    private Message message;
    @JsonProperty("detailedMessage")
    private Message detailedMessage;
    private Resource resource;
    @JsonProperty("resourceVersion")
    private String resourceVersion;
    @JsonProperty("resourceContainers")
    private ResourceContainers resourceContainers;
    @JsonProperty("createdDate")
    private Date createdDate;

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setDetailedMessage(Message detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    public Message getDetailedMessage() {
        return detailedMessage;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceContainers(ResourceContainers resourceContainers) {
        this.resourceContainers = resourceContainers;
    }

    public ResourceContainers getResourceContainers() {
        return resourceContainers;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

}
