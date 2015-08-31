package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class HomeController {
	
	@RequestMapping("index")
	public String index()
	{
		return "home.index";
	}
	
	@RequestMapping("save")
	public void saveCodi(HttpServletRequest request){
		String test = request.getParameter("data");
		
	}
}
