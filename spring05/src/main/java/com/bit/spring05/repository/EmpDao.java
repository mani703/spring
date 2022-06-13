package com.bit.spring05.repository;

import java.util.List;

import com.bit.spring05.domain.Emp;

public interface EmpDao {
	
	List<Emp> findAll();
	Emp findOne(int idx);
	int insertOne(Emp emp);
}
