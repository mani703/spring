package com.bit.spring08.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bit.spring08.domain.Dept;

@Mapper
public interface DeptDao {

	@Select("select * from dept")
	public List<Dept> findAll();
}
