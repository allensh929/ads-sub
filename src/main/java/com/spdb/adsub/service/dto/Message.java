package com.spdb.adsub.service.dto;

import com.google.gson.annotations.Expose;

/**
 * Auto-generated: 2019-12-11 13:29:50
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Message {

    @Expose
    private String text;
    @Expose
    private String html;
    @Expose
    private String markdown;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }
}
