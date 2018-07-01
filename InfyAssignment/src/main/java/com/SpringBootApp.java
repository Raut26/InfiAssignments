package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class SpringBootApp {
	
   public static void main(String[] args) {
	
	   
	   System.out.println("Main method start----------");
	   
	   SpringApplication.run(SpringBootApp.class, args);
	   
	   System.out.println("Main method end----------");
	   
}
	

}
