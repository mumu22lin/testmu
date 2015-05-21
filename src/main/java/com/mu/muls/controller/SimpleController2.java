package com.mu.muls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mu.muls.service.BaseService;



@Controller
public class SimpleController2 {
	
//	@Autowired
	BaseService baseService;
	
	
	@RequestMapping(value="/index2")
	public String index2(){
		System.out.println("go index2======222=====>>>>>>>>");
		baseService.out();
		System.out.println("baseService ount="+baseService.count);
		return "/jsp/index2";
		
	}

}
