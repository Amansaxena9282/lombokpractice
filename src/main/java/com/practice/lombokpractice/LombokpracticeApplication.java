package com.practice.lombokpractice;

import com.practice.lombokpractice.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokpracticeApplication.class, args);
		User user=new User();
		user.setName1("neeraj sir is our manager of eleserv softech");
//		user.setName("neeraj sir is our manager");
		System.out.println("Company ="+user.getName1());
//		System.out.println("softech ="+user.getName());
	}

}
