package com.bit.spring01.model;

import java.sql.Timestamp;
import java.util.Objects;

public class EmpVo {
	private int empno, sal;
	private String ename, job;
	private Timestamp hiredate;
	
	public EmpVo() {
	}

	public EmpVo(int empno, int sal, String ename, String job, Timestamp hiredate) {
		super();
		this.empno = empno;
		this.sal = sal;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Timestamp getHiredate() {
		return hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "EmpVo [empno=" + empno + ", sal=" + sal + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empno, ename, job, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpVo other = (EmpVo) obj;
		return empno == other.empno && Objects.equals(ename, other.ename) && Objects.equals(job, other.job)
				&& sal == other.sal;
	}
	
}
