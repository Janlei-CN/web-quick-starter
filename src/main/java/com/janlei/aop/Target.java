package com.janlei.aop;

import org.springframework.stereotype.Component;

@Component
public class Target {

	public void handle(){
		System.out.println("业务方法");
	}
}
