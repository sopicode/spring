package com.inautix;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource=new ClassPathResource("Hello.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		Hello bean=(Hello)factory.getBean("myid");
		bean.sayHello();
		
	}

}
