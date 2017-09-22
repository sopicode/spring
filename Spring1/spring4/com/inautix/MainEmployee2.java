package com.inautix;

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
		Employee2 bean=(Employee2)factory.getBean("myemp");
		Employee2 bean2=(Employee2)factory.getBean("myemp2");
		
		//inner bean
		System.out.println(bean);
		
		//manual wiring
		System.out.println(bean2);
		
//		//collections
//		Collection bean3=(Collection)factory.getBean("collbean");
//		System.out.println(bean3);
		
	}

}
