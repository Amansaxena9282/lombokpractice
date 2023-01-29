package com.practice.lombokpractice.Controller;

import com.practice.lombokpractice.model.User;
import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return user;
    }

    @PutMapping("/update")
    public User update(@RequestBody User user) {
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public String deletedata(@PathVariable int id) {
        return "your id" + "deleted success" + id;
    }

    @GetMapping("/ex2/{age}/data")
    public User getuserdetails(@PathVariable int age, @RequestParam String name) {
        String name1 = name ;
        int age1 = age;
        User user = new User();
        return user;
    }



@GetMapping("/aman")
    public String xyz(){
    return "main pagal hu ";
}


}

