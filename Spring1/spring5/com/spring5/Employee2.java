package com.spring5;

public class Employee2 {

	
	int eid;
	String ename;
	int sal;
	String bu;
	

	
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


	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", bu=" + bu + "]";
	}


	

	
	
}
