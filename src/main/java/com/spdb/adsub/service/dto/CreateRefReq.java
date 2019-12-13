
package com.spdb.adsub.service.dto;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CreateRefReq {

    @Expose
    public String name;
    @Expose
    public String oldObjectId ="0000000000000000000000000000000000000000";
    @Expose
    public String newObjectId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldObjectId() {
        return oldObjectId;
    }

    public void setOldObjectId(String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    public String getNewObjectId() {
        return newObjectId;
    }

    public void setNewObjectId(String newObjectId) {
        this.newObjectId = newObjectId;
    }
}
