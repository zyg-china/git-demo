package com.test.china.springboot0506.test;

import com.test.china.springboot0506.entity.person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringContextDemo {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:beans.xml");
       person p = new person();
       p = (person) act.getBean("person");
        System.out.println("name:"+p.getName());

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        person p2 = (person) beanFactory.getBean("person");
        System.out.println("id:"+p2.getId());
    }
}
