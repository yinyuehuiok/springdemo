package com.demo.aop;

public enum OperateLogEnum {
	
	ADD("add"),UPDATE("update"),DELETE("delete"),OTHER("other");
	
	private String desc;
	
	OperateLogEnum(String desc){
		this.desc = desc;
	}
	
	public String getDesc(){
		return desc;
	}

}
