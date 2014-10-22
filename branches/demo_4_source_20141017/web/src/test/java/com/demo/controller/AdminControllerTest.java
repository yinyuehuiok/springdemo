package com.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AdminControllerTest {
	
	@Before
	public void init(){
		
	}
	
	@Test
	public void testLogin(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath*:spring*.xml"});
		System.out.println(ac.getBeanNamesForType(AdminController.class).length);
	}
	
	

}
