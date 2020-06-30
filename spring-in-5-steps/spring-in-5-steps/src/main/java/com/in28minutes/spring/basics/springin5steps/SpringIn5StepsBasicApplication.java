package com.in28minutes.spring.basics.springin5steps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext=SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		//BinarySearchImpl binarySearch1=applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		//System.out.println(binarySearch1);
		
		int result=binarySearch.binarySearch(new int[] {1,3,4,5}, 3);
		System.out.println(result);
		
//		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
