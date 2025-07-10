package com.code.Application_management_web_app.repositiory;

import com.code.Application_management_web_app.Entity.JobManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobManagement,Integer> {

}
