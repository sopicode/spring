package com.spring5;

import java.util.List;

public class Dept {

	String subj_code;
	String name;
	String head;
	List<Employee2> list;
	

	public String getSubj_code() {
		return subj_code;
	}
	public void setSubj_code(String subj_code) {
		this.subj_code = subj_code;
	}
	public List<Employee2> getList() {
		return list;
	}
	public void setList(List<Employee2> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	@Override
	public String toString() {
		return "Dept [subj_code=" + subj_code + ", name=" + name + ", head=" + head + ", list=" + list + "]";
	}
	
	
	
	
	
	
	
	
}
