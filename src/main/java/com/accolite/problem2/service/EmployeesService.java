package com.accolite.problem2.service;

import com.accolite.problem2.model.Employee;
import com.accolite.problem2.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {

    @Autowired(required = false)
    EmployeesRepository employeesRepository;

    //getting all Employees record by using the method findaAll() of CrudRepository
    public List<Employee> getAllEmployees() {
        return null;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Employee getEmployeesById(int id) {
        return null;
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Employee employee) {

    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id) {
    }

    //updating a record
    public void update(Employee Employee, int Employeeid) {

    }
}