package com.demo.vo;

import com.demo.model.MessageModel;

public class MessageVo {

	private String username;
	private String sexy;
	private String content;

	public MessageVo(MessageModel message) {
		this.username = message.getUsername();
		switch (message.getSexy()) {
		case 1:
			this.sexy = "男";
			break;
		case 2:
			this.sexy = "女";
			break;
		default:
			this.sexy = "";
		}
		switch (message.getContent()) {
		case 1:
			this.content = "aop原理";
			break;
		case 2:
			this.content = "定时器使用";
			break;
		case 3:
			this.content = "常用的注解";
			break;
		default:
			this.content = "";
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSexy() {
		return sexy;
	}

	public void setSexy(String sexy) {
		this.sexy = sexy;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
