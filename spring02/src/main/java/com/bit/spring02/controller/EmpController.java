package com.bit.spring02.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.spring02.model.EmpDao;
import com.bit.spring02.model.EmpVo;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpDao<EmpVo> empDao;

	@RequestMapping("/")
	public String list(Model model) throws SQLException {
		model.addAttribute("list", empDao.findAll());
		return "emp/list";
	}
}
