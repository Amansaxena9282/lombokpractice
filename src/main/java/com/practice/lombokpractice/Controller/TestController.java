package com.practice.lombokpractice.Controller;

import com.practice.lombokpractice.model.User;
import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController//  it indicate that u r working on rest api
@RequestMapping("/api/v1")// for additional URL globally add for particular class
public class TestController {
    @PostMapping("/add")   // for data insert
    public User addUser(@RequestBody User user) {
        return user;
    }

    @PutMapping("/update") // for data updation
    public User update(@RequestBody User user) {// req body is used to pass json
        return user;
    }

    @DeleteMapping("/delete/{id}")  // path vaiable bec its mention in url
    public String deletedata(@PathVariable int id) {   // delete is used for delete daTA
        return "your id" + "deleted success" + id;
    }

    @GetMapping("/ex2/{age}/data") // IT IS USED TO GET THE DATA
    public User getuserdetails(@PathVariable int age, @RequestParam String name) {// req param is known as query param is used sorting out the req data
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

