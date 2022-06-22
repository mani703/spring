package com.bit.boot06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.boot06.repository.EmpRepo;
import com.bit.boot06.repository.domain.Emp;

@Service
public class EmpServiceImlp {
	
	@Autowired
	EmpRepo empRepo;
	
	public List<Emp> selectAll() {
		return empRepo.findAll(); 
	}
	
	public Emp insertOne(Emp bean) {
		if(empRepo.insertOne(bean) > 0)
			return bean;
		return null;
	}

}
