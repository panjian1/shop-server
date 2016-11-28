package com.changyu.foryou.model;

import com.avos.avoscloud.AVUser;

import java.util.Date;

public class Users  extends AVUser {


    private String imgUrl;

    private Date lastLoginDate;

    private Date createTime;
    
    private String defaultAddress;
    
    private String token;
    
    private String sex;
    
    private String academy;
    
    private String qq;
    
    private String weiXin;

	private String weibo;

    private String source;


	public Users(String username2, String password2,String source) {
		this.setUsername(username2);
		this.setPassword(password2);
		this.setSource(source);
		createTime=new Date();
		lastLoginDate=new Date();
	}
	public Users() {
	}


    public String getImgUrl() {
        return this.getString("imgUrl");
    }

    public void setImgUrl(String imgUrl) {
		this.put("imgUrl",this.imgUrl = imgUrl == null ? null : imgUrl.trim());
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDefaultAddress() {
		return defaultAddress;
	}

	public void setDefaultAddress(String defaultAddress) {
		this.defaultAddress = defaultAddress;
	}

	public String getSex() {
		return this.getString("sex");
	}

	public void setSex(String sex) {
		this.put("sex",sex);
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getQq() {
		return this.getString("qq");
	}

	public void setQq(String qq) {
		this.put("qq",qq);
	}

	public String getWeiXin() {
		return this.getString("weixin");
	}

	public void setWeiXin(String weiXin) {
		this.put("weixin",weiXin);
	}


	public String getWeibo() {
		return this.getString("weibo");
	}

	public void setWeibo(String weibo) {
		this.put("weibo",weibo);
	}

	public String getSource() {
		return this.getString("source");
	}

	public void setSource(String source) {
		this.put("source",source);
	}
}