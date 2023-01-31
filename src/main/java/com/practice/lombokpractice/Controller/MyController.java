package com.practice.lombokpractice.Controller;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController<var> {

    @RequestMapping(path="/message", produces=MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public <var> String processForm(@RequestParam(defaultValue="Guest") String name,
                                    @RequestParam(required = false) String adult) {

        String greet = String.valueOf((var) ("on".equals(adult) ? "Good morning" : "Hi"));

        return String.format("%s %s!", greet, name);
    }
}
