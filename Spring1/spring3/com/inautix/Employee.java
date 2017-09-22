package com.inautix;

public class Employee {
	
	int eid;
	String ename;
	int sal;
	String bu;
	
	public Employee()
	{
		
	}
	
	
	public Employee(int eid, String ename, int sal, String bu) {
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
	
	
	

}
