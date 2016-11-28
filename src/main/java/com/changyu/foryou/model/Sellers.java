package com.changyu.foryou.model;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;


@AVClassName("Sellers")
public class Sellers extends AVObject{
	private String adminName;
	
	private String password;
	
	private String type;
	
	private String lastLoginDate;

	public String getAdminName() {
		return this.getString("adminName");
	}

	public void setAdminName(String adminName) {
		this.put("adminName", adminName);
	}

	public String getPassword() {
		return this.getString("password");
	}

	public void setPassword(String password) {
		this.put("password", password);
	}

	public String getType() {
		return this.getString("type");
	}

	public void setType(String type) {
		this.put("type", type);
	}

	public String getLastLoginDate() {
		return this.getString("lastLoginDate");
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.put("lastLoginDate", lastLoginDate);
	}

	public Sellers(){}
}
