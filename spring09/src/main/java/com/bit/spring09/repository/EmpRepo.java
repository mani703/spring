package com.bit.spring09.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bit.spring09.domain.Emp;

@Mapper
public interface EmpRepo {

	@Select("select * from emp")
	List<Emp> findAll();
	
	@Select("select * from emp where empno=#{value}")
	Emp findOne(int empno);
	
	@Insert("insert into emp (empno, ename, sal, job, hiredate) values (#{empno}, #{ename}, #{sal}, #{job}, now())")
	int insertOne(Emp emp);
	int updateOne(Emp emp);
	
	@Delete("delete from emp where empno=#{value}")
	int deleteOne(int empno);
}
