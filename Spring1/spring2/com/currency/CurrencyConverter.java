package com.currency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.inautix.Hello;

public class CurrencyConverter implements Currency {
	
	public static void main(String args[])
	{
		Resource resource=new ClassPathResource("Hello.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		Currency bean=(CurrencyConverter)factory.getBean("mycurr");
		System.out.println(bean.dollarToRupees());
	}

	@Override
	public int dollarToRupees() {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

}
