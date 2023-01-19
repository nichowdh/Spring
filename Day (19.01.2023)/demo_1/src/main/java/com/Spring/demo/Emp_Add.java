package com.Spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Emp1;

public class Emp_Add {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("ApplicationContext.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Emp1 e = (Emp1) b.getBean("emp");
		e.display();

	}

}
