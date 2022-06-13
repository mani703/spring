package com.bit.spring05.service;

import org.springframework.ui.Model;

import com.bit.spring05.domain.Emp;

public interface EmpService {
	
	void selectAll(Model model);

	Emp insert(Emp bean);

	Emp detail(int empno);

	Emp update(Emp bean);

	boolean delete(int empno);

	boolean login(Emp bean);

	void logout();
}