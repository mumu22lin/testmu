package com.mu.muls.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class MyBean {
	
	private int age=10;
	private String name="aa";
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date birthDate;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Bean(name="m2")
	public MyBean2 myBean2(){
		return new MyBean2();
	}

}
