package com.accolite.problem2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity
@Table
public class Employee {
    //Defining Employee id as primary key
    @Id
    @Column
    private int employeeid;
    @Column
    private String employeename;
    @Column
    private String managerName;
    @Column
    private int salary;

    public Employee() {}

    public Employee(int employeeid, String employeename, String managerName, int salary) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.managerName = managerName;
        this.salary = salary;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}