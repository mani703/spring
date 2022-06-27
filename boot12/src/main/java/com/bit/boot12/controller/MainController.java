package com.bit.boot12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@RequestMapping("/home")
	public String page1() {
		String msg = "abcd";
		
		return "home";
	}
	
	@RequestMapping("/")
	public String page2() {
		return "home";
	}
	
	@RequestMapping("/hello")
	public String page3() {
		return "hello";
	}
	
	@RequestMapping("/login")
	public String page4() {
		return "login";
	}
}
