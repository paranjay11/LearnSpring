package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)// this gives multiple beans for a class from applicationcontext
public class BinarySearchImpl {
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortingAlgorithm;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// this can be removed and still it will work but in the logs it will not show created through constructor...
//	public BinarySearchImpl(SortAlgorithm sortingAlgorithm) {
//		super();
//		this.sortingAlgorithm=sortingAlgorithm;
//	}
	public int binarySearch(int[] numbers,int numberToSearchFor) {
		
		// implement sort algorithm
		//BubbleSortAlgorithm bubbleSortAlgorithm= new BubbleSortAlgorithm();
		int[] sortedNumbers =  sortingAlgorithm.sort(numbers);
		System.out.println(sortingAlgorithm);
		
		return 3;
	}
	
	@PostConstruct
	public void postConstructMethod() {// name of this function does not matter
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroyMethod() {
		logger.info("preDestroyMethod called");
		try {
			Thread.sleep(2*1000);
		}catch(InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		
	}

}
