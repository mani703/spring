package com.bit.boot14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bit.boot14.TokenServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	TokenServiceImpl tokenService;
	
	@GetMapping("/create")
	public String create() {
		return tokenService.createToken();
	}
	
	@GetMapping("/check")
	public String check(@RequestParam String token) {
		return tokenService.getUser(token);
	}
}
