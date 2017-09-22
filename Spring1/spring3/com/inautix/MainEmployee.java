package com.inautix;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource=new ClassPathResource("emp.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee bean=(Employee)factory.getBean("myemp");
		
		System.out.println("using Getters Emp Details are:-");
		System.out.println("Employee Id: "+bean.getEid());
		System.out.println("Employee Name: "+bean.getEname());
		System.out.println("Employee Sal: "+bean.getSal());
		System.out.println("Employee BU: "+bean.getBu());
		
		Employee bean2=(Employee)factory.getBean("constbean");
		
		System.out.println("Using Constructor Emp Details are:-");
		System.out.println("Employee Id: "+bean2.getEid());
		System.out.println("Employee Name: "+bean2.getEname());
		System.out.println("Employee Sal: "+bean2.getSal());
		System.out.println("Employee BU: "+bean2.getBu());

		
		
		
		
	}

}
