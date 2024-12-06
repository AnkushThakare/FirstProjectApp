package com.example.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProject {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello ";
    }
    @RequestMapping("/hello/{name}")
    public String sayHellotosomeone(@PathVariable("name") String name){
        return "hello " + name;
    }

}
