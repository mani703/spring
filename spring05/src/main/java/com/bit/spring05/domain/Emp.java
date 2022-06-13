package com.bit.spring05.domain;

import java.sql.Timestamp;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	
	private int empno, sal;
	private String ename, job;
	private Timestamp hiredate;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empno == other.empno && Objects.equals(ename, other.ename) && Objects.equals(job, other.job)
				&& sal == other.sal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empno, ename, job, sal);
	}
	
	
}
