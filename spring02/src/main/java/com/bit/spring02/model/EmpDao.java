package com.bit.spring02.model;

import java.sql.SQLException;
import java.util.List;

public interface EmpDao<T> {

	List<T> findAll() throws SQLException;
	T findObject(int key) throws SQLException;
	void insertOne(T t) throws SQLException;
	int updateOne(T t) throws SQLException;
	int deleteOne(int key) throws SQLException;
}
