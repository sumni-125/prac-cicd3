package com.example.prac_cicd3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @ResponseBody
    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

}
