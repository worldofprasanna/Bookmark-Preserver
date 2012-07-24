package com.bmp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bookmark")
public class Bookmark extends AbstractEntity{
	
	private String userId;
	private String url;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	
}
