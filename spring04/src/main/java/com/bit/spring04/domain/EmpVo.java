package com.bit.spring04.domain;


import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVo {
	private int empno, sal;
	private String ename, job;
	private Timestamp hirerdate;
}
