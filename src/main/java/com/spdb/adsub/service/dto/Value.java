
package com.spdb.adsub.service.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Value {

    @Expose
    private Boolean isLocked;
    @Expose
    private String name;
    @Expose
    private String newObjectId;
    @Expose
    private String oldObjectId;
    @Expose
    private String repositoryId;
    @Expose
    private Boolean success;
    @Expose
    private String updateStatus;
    @Expose
    private String objectId;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Expose
    private String url;

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewObjectId() {
        return newObjectId;
    }

    public void setNewObjectId(String newObjectId) {
        this.newObjectId = newObjectId;
    }

    public String getOldObjectId() {
        return oldObjectId;
    }

    public void setOldObjectId(String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

}
