package com.inautix;

public class Dept {

	
	int id;
	String name;
	String head;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Dept [id=" + id + ", name=" + name + ", head=" + head + "]";
	}
	
	
	
}
