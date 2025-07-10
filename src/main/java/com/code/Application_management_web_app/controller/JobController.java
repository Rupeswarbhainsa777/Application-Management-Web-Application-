package com.code.Application_management_web_app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("job")
public class JobController {


    @GetMapping("java")
    public String jobStatus(){
        return  "hii Rojalin";
    }
}
