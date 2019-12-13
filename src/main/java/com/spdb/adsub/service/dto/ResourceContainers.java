package com.spdb.adsub.service.dto;

import com.google.gson.annotations.Expose;

/**
 * Auto-generated: 2019-12-11 13:29:50
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class ResourceContainers {

    @Expose
    private Collection collection;
    @Expose
    private Account account;
    @Expose
    private Project project;
    public void setCollection(Collection collection) {
         this.collection = collection;
     }
     public Collection getCollection() {
         return collection;
     }

    public void setAccount(Account account) {
         this.account = account;
     }
     public Account getAccount() {
         return account;
     }

    public void setProject(Project project) {
         this.project = project;
     }
     public Project getProject() {
         return project;
     }

}
