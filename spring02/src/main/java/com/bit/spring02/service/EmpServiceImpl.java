package com.bit.spring02.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.bit.spring02.model.EmpDao;
import com.bit.spring02.model.EmpVo;

@Component
public class EmpServiceImpl {
	
	@Autowired
	EmpDao<EmpVo> empDao;

	public void selectAll(Model model) throws SQLException {
		model.addAttribute("list", empDao.findAll());
	}
	
	public void insert(EmpVo bean) throws SQLException {
		empDao.insertOne(bean);
	}
}
