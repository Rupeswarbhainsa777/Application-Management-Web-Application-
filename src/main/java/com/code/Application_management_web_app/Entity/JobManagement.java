package com.code.Application_management_web_app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "jobdetails")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class JobManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyName;
    private String jobType;
    private Timestamp date;
    private String companyType;
    private String status;
}
