package com.inautix;

public class Employee2 {

	
	int eid;
	String ename;
	int sal;
	String bu;
	Dept dept;
	
	public Employee2()
	{
		
	}
	
	
	public Employee2(int eid, String ename, int sal, String bu) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.bu = bu;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}


	public Dept getDept() {
		return dept;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", bu=" + bu + ", dept=" + dept + "]";
	}
	
	

	
	
}
