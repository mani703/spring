package com.bit.spring02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

	@RequestMapping({"/", "/index"})
	public String index() {
		return "index";
	}
}
