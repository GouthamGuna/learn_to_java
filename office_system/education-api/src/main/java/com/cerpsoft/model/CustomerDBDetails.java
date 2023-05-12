package com.cerpsoft.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "customerDBDetails")
public class CustomerDBDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String appName;
    private String dbHost;
    private String dbName;
    private String dbUserName;
    private String dbUserSecret;
    @Column(columnDefinition = "char default 'Y'")
    private char isActive;
    private String creator;
    private Timestamp activityLog;
}
