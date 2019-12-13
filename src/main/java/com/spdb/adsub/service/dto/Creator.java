
package com.spdb.adsub.service.dto;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Creator {

    @Expose
    private com.spdb.adsub.service.dto._links _links;
    @Expose
    private String descriptor;
    @Expose
    private String displayName;
    @Expose
    private String id;
    @Expose
    private String imageUrl;
    @Expose
    private String uniqueName;
    @Expose
    private String url;

    public com.spdb.adsub.service.dto._links get_links() {
        return _links;
    }

    public void set_links(com.spdb.adsub.service.dto._links _links) {
        this._links = _links;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
