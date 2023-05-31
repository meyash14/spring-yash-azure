package com.yash.azureapp.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Builder
@Data
public class Employee {
    @Id
    @GeneratedValue
    private int empId;
   private String empName;
}
