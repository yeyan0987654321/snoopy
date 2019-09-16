package com.fa;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.pojo.Student;

public class TestName {
@Test
	public void Test01() {
		/*
		 * Resource resource=new ClassPathResource("bean.xml"); BeanFactory
		 * beanfactory=new XmlBeanFactory(resource); JavaBean bean=(JavaBean)
		 * beanfactory.getBean("say"); System.out.println(bean);
		 */
	ApplicationContext app=(ApplicationContext) new ClassPathXmlApplicationContext("bean.xml");
	Student stu=(Student) app.getBean("Student");
	System.out.println(stu);
	
	}
}
