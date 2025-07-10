package com.code.Application_management_web_app.controller;

import com.code.Application_management_web_app.Entity.JobManagement;
import com.code.Application_management_web_app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/add")
    public JobManagement addJob(@RequestBody JobManagement job) {
        return jobService.saveJob(job);
    }
}
