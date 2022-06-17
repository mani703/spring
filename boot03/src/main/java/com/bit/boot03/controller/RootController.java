package com.bit.boot03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Hello world";
	}
	
	@GetMapping("/ex01")
	public String ex01(Model model) {
		model.addAttribute("msg", "환영합니다");
		return "ex01";
	}
}
