package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
    @Id
    private int empId;
    @Column
    private String empName;

    public Employee() {
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
