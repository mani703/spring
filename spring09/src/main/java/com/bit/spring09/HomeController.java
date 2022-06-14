package com.bit.spring09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bit.spring09.service.EmpService;


@Controller
public class HomeController {
	
	@Autowired
	EmpService empService;

	@GetMapping("/")
	public String list(Model model) {
		empService.selectAll(model);
		return "home";
	}
	
	@GetMapping("/{idx}")
	public String emp(Model model, @PathVariable int idx) {
//		empService.selectOne(model, idx);
		empService.delete(idx);
//		return "detail";
		return "redirect:./";
	}
}
