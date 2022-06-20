package com.bit.boot04.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.boot04.mapper.DeptMapper;
import com.bit.boot04.mapper.domain.Dept;

@Service
public class RestServiceImpl {
	
	private final DeptMapper deptMapper;
	
//	@RequiredArgsConstructor
	public RestServiceImpl(DeptMapper deptMapper) {
		this.deptMapper = deptMapper;
	}
	
	public List<Dept> selectAll() {
		return deptMapper.findAll();
	}
	
	public Dept selectOne(int idx) {
		return deptMapper.findOne(idx);
	}
	
	public int insertOne(Dept bean) {
		return deptMapper.insertOne(bean);
	}
	
	public int updateOne(Dept bean) {
		return deptMapper.updateOne(bean);
	}
	
	public int deleteOne(int idx) {
		return deptMapper.deleteOne(idx);
	}
}
