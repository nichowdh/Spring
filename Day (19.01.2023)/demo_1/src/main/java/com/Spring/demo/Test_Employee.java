package com.Spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Employee;

public class Test_Employee {
	public static void main(String[] args) {

		Resource res = new ClassPathResource("ApplicationContext.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Employee e = (Employee) b.getBean("L");
		e.display();
	}
}
