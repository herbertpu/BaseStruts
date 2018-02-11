package com.bean;

import java.util.Date;

public class User {
	
	Date CreateDate;
	
	String id ;
	
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
	public Date getCreateDate() {
		return CreateDate;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

}
