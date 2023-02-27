package com.springproj.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.SpringVersion;
@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args) {
		/*
		dependency injection (loose coupling)
		BinarySearchImpl binarySearchbar= new BinarySearchImpl();
		SpringApplication.run(BasicsApplication.class, args);
*/
		ApplicationContext applicationContext =SpringApplication.run(BasicsApplication.class, args);
		BinarySearchImpl binarySearchbar=applicationContext.getBean(BinarySearchImpl.class);
		int res= binarySearchbar.binarySearch(new int[] {12,4,6, 5, 3,8}, 4);
		System.out.println(res);
		//printing version of spring and java

		System.out.println("spring version: " + SpringVersion.getVersion());
		String version1 = System.getProperty("java.version");
		System.out.println("java version:" + version1);
	}

}
