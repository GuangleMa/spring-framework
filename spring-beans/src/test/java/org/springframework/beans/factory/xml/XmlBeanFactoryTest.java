package org.springframework.beans.factory.xml;

import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.*;

public class XmlBeanFactoryTest {

	private static String file = "org/springframework/beans/factory/BeanFactoryUtilsTests-leaf.xml";

	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource(file));
		System.out.println(xmlBeanFactory.getBean("test3"));
	}
}