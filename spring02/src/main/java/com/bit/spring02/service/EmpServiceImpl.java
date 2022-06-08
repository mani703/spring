package com.bit.spring02.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.bit.spring02.model.EmpDao;
import com.bit.spring02.model.EmpVo;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpDao<EmpVo> empDao;

	@Override
	public void selectAll(Model model) throws SQLException {
		model.addAttribute("list", empDao.findAll());
	}
	
	@Transactional(rollbackFor = SQLException.class)
	@Override
	public void insert(EmpVo bean) throws SQLException {
		empDao.insertOne(bean);
		bean.setEmpno(bean.getEmpno()+1);
		empDao.insertOne(bean);
	}
}
