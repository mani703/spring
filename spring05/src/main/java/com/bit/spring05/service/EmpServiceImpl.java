package com.bit.spring05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.spring05.repository.EmpDao;

@Service
public class EmpServiceImpl {
	
	@Autowired
	EmpDao empDao;
	
	public void selectAll(Model model) {
		model.addAttribute("list", empDao.findAll());
		model.addAttribute("total", empDao.totalSize());
	}
}
