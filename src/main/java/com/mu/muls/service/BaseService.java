package com.mu.muls.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
	public int count=1;
	
	@PostConstruct
	public void init(){
		System.out.println(this.getClass().getName()+"=========>>>init,,,init");
	}
	
	

	@PreDestroy
	public void destroy(){
		System.out.println(this.getClass().getName()+"=========>>>destroy,,,destroy");
	}
	
	
	public void out(){
		System.out.println(this.getClass().getName()+"=========>>>out");
	}

}
