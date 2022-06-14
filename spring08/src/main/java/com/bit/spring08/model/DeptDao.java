package com.bit.spring08.model;

import java.util.List;

import com.bit.spring08.domain.Dept;

public interface DeptDao {

	public List<Dept> findAll();
}
