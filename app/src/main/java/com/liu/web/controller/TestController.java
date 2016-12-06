package com.liu.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.web.service.TestService;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	@Resource
	private TestService testService;
	
	@RequestMapping(value="/list.do")
	public String listTest(Model model){
		
		model.addAttribute("problembanks",testService.listuser());
		
		return "test";
	}
	
	
}
