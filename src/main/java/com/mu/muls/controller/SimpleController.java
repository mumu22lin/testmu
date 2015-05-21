package com.mu.muls.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.mu.muls.service.BaseService;



@Controller
public class SimpleController {
	
	
	@Autowired
	BaseService baseService;
	
	@Value("${http.readTimeout}")
	String configStr;
	
	@Autowired
	@Qualifier("m2")
	MyBean2 mb2;
	
	@RequestMapping(value="/index")	
	public String index(HttpServletRequest req, HttpServletResponse res){
		
		System.out.println("mb2========>>>>>>>>>"+mb2.getName());
		
		System.out.println("init str===="+configStr);
		System.out.println("go index======111=====>>>>>>>>count="+baseService.count);
		baseService.out();
		baseService.count++;
		//myBean.setAge(10+baseService.count);
		//System.out.println("my bean =="+myBean.getAge());
		return "/jsp/index";
		
	}
	
	@RequestMapping(value="/index12")
	public String index2(HttpServletRequest req){
		
//		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
//		        "/spring.xml");
		
		WebApplicationContext bf  = RequestContextUtils.getWebApplicationContext(req);
		
		//WebApplicationContext bf =WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
		MyBean b = (MyBean)bf.getBean("myBean");
		baseService.count++;
		b.setAge(b.getAge()+baseService.count);
		System.out.println("my bean =="+b.getAge());
		
		
		System.out.println("go index2======222=====>>>>>>>>");
		baseService.out();
		System.out.println("baseService ount="+baseService.count);
		return "/jsp/index2";
		
	}

}
