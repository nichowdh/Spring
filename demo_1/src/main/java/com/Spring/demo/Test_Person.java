package com.Spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Person;

public class Test_Person {
	public static void main(String[] args) {
		// resource -object of Resource Interface, Represent the info of xml file
		// ClassPathResource - it is the implementation class of Resource
		Resource resource = new ClassPathResource("ApplicationContext.xml");
		// BeanFactory -- its an interface which return the bean
		// XmlBeanfactory --its the implementation class of the beanfactory
		BeanFactory bf = new XmlBeanFactory(resource);
		// getBean -- its a method of BeanFactory--which return the objects of the
		// associated class now that is person

		Person p = (Person) bf.getBean("Y");
		p.display();
	}

}
