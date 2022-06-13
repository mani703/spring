package com.bit.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bit.spring05.service.EmpServiceImpl;

@Controller
public class EmpController {

	@Autowired
	EmpServiceImpl empService;
	
	@GetMapping("/emp/")
	public String list(Model model) {
		empService.selectAll(model);
		return "list";
	}
}
