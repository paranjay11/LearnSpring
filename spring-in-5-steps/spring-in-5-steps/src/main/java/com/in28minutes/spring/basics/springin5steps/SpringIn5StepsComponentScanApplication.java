package com.in28minutes.spring.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan") // since the package by default is  com.in28minutes.spring.basics.spring5steps it does not pick up 
															  //files from package componentscan , so we need to explicitly include it.
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext=SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		 
		ComponentDAO componentDao=applicationContext.getBean(ComponentDAO.class);
		
	//	ComponentDAO componentDao2 = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",componentDao);
		
	}
}
