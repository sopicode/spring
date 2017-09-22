package com.spring5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainEmployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource=new ClassPathResource("emp2.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		Dept bean2=(Dept)factory.getBean("deptbean11");
		
		System.out.println(bean2);
		
	}

}
