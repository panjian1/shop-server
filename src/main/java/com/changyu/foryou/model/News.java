package com.changyu.foryou.model;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;
@AVClassName("news")
public class News extends AVObject{
    private String newsId;

    private String title;

    private String imgUrl;

    private String content;

    public String getNewsId() {
        return this.getString("newsId");
    }

    public void setNewsId(String newsId) {
        this.put("newsId", newsId);
    }

    public String getTitle() {
        return this.getString("title");
    }

    public void setTitle(String title) {
        this.put("title", title);
    }

    public String getImgUrl() {
        return this.getString("imgUrl");
    }

    public void setImgUrl(String imgUrl) {
        this.put("imgUrl", imgUrl);
    }

    public String getContent() {
        return this.getString("content");
    }

    public void setContent(String content) {
        this.put("content", content);
    }

    public News(){}

}