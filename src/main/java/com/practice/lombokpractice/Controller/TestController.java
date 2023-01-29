package com.practice.lombokpractice.Controller;

import com.practice.lombokpractice.model.User;
import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController
{
//    @PostMapping("/add")
//    public User addUser@RequestMapping

@GetMapping("/aman")
    public String xyz(){
    return "main pagal hu ";
}


}

