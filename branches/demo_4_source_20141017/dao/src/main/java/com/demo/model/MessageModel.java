package com.demo.model;

import java.io.Serializable;


public class MessageModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String username;
	private int sexy;
	private int content;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSexy() {
		return sexy;
	}
	public void setSexy(int sexy) {
		this.sexy = sexy;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	

}
