package com.bit.spring02.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.spring02.model.EmpVo;
import com.bit.spring02.service.EmpServiceImpl;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpServiceImpl empService;

	@RequestMapping("/")
	public String list(Model model) throws SQLException {
		empService.selectAll(model);
		return "emp/list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add() {}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute EmpVo bean) throws SQLException {
		empService.insert(bean);
		return "redirect:./";
	}
}
