package com.in28minutes.spring.basics.springin5steps;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;


@Configuration //earlier we were using springContextApplicatiopn when we were using springboot. BUt in both the cases spring or spring boot we need Application context
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);
	public static void main(String[] args) {
		
		
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){// we dont need to close this application context as it will call a closer on its own 
				
		LOGGER.info("Beans Loaded -> {}",(Object) applicationContext.getBeanDefinitionNames());// type casting it to an 'Object' will get all the names combined together and put it into {} or else only one bean name is sent to it.
			
		XmlPersonDAO personDAO=applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{} {}",personDAO,personDAO.getXmlJdbcConnection());
//		
//		System.out.println(personDAO);
//		
//		
//		System.out.println(personDAO.getXmlJdbcConnection());
		
		}
		
	}

}
