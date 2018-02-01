package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	public IndexController() {
		System.out.println("---IndexController 被容器初始化了。---------------");
	}
	
	@RequestMapping({"/index","/"})
	public String index() {
		return "index";
	}
}
