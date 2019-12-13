package com.spdb.adsub.service.dto;

import com.google.gson.annotations.Expose;

/**
 * Auto-generated: 2019-12-11 13:29:50
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Resource {
    @Expose
    private int id;
    @Expose
    private String url;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

}
