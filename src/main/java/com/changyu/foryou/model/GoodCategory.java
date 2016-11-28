package com.changyu.foryou.model;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

import java.util.List;

@AVClassName("goodCategory")
public class GoodCategory extends AVObject{


    private String category;

    private String imgUrl;

    private String parentId;

    private String tag;
    
    private String serial;
    
    private String isOpen;

    private List<GoodCategory> child;

    private String childPath; // id/id/id
    
    public GoodCategory(){}

    public String getCategory() {
        return this.getString("category");
    }

    public void setCategory(String category) {
        this.put("category", category);
    }

    public String getImgUrl() {
        return this.getString("imgUrl");
    }

    public void setImgUrl(String imgUrl) {
        this.put("imgUrl", imgUrl);
    }

    public String getParentId() {
        return this.getString("parentId");
    }

    public void setParentId(String parentId) {
        this.put("parentId", parentId);
    }

    public String getTag() {
        return this.getString("tag");
    }

    public void setTag(String tag) {
        this.put("tag", tag);
    }

    public String getSerial() {
        return this.getString("serial");
    }

    public void setSerial(String serial) {
        this.put("serial", serial);
    }

    public String getIsOpen() {
        return this.getString("isOpen");
    }

    public void setIsOpen(String isOpen) {
        this.put("isOpen", isOpen);
    }


    public String getChildPath() {
        return this.getString("childPath");
    }

    public void setChildPath(String childPath) {
        this.put("childPath", childPath);
    }
}