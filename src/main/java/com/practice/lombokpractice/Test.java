package com.practice.lombokpractice;

import com.practice.lombokpractice.model.User;
import org.springframework.boot.SpringApplication;

public class Test {
    public static void main(String[] args) {
        SpringApplication.run(LombokpracticeApplication.class, args);
        User user=new User();
        user.setName("aman");
        System.out.println("eleserv softech="+user.getName());
    }
}
