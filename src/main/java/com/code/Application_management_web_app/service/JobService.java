
package com.code.Application_management_web_app.service;
import com.code.Application_management_web_app.Entity.JobManagement;
import com.code.Application_management_web_app.repositiory.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {



    @Autowired
    private JobRepository jobRepository;

    public JobManagement saveJob(JobManagement job) {
        return jobRepository.save(job);
    }
}
