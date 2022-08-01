package com.waiyanhtet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.waiyanhtet.model.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService service;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", service.getMessage());
		return "index";
	}
}
