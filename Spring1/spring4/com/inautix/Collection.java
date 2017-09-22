package com.inautix;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection {

	
	List arr;
	Set set;
	Map map;
	Properties prop;
	List<Dept> deptlist;
	
	
	

	public List getArr() {
		return arr;
	}

	public void setArr(List arr) {
		this.arr = arr;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	
	

	public List<Dept> getDeptlist() {
		return deptlist;
	}

	public void setDeptlist(List<Dept> deptlist) {
		this.deptlist = deptlist;
	}

	@Override
	public String toString() {
		return "Collection [arr=" + arr + ", set=" + set + ", map=" + map + ", prop=" + prop + ", deptlist=" + deptlist
				+ "]";
	}

	

	
	
	
	
	
	
}
