package com.accolite.problem2;


import com.accolite.problem2.model.Employee;
import com.accolite.problem2.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//mark class as Controller
@RestController
public class EmployeesController {

    @Autowired
    EmployeesService employeesService;

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    private String health() {
        return "Server is up and running";
    }

    //creating a get mapping that retrieves all the Employees detail from the database
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    private List<Employee> getAllEmployees() {
        return null;
    }

    //creating a get mapping that retrieves the detail of a specific Employee
    @RequestMapping(value = "/employee/{employeeid}", method = RequestMethod.GET)
    private Employee getEmployees(@PathVariable("Employeeid") int employeeid) {
        return null;
    }

    //creating a delete mapping that deletes a specified Employee
    @RequestMapping(value ="/employee/{employeeid}", method = RequestMethod.DELETE)
    private void deleteEmployee(@PathVariable("Employeeid") int employeeid) {

    }

    //creating post mapping that post the Employee detail in the database
    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    private int saveEmployee(@RequestBody Employee employee) {
        return 1;
    }

    //creating put mapping that updates the Employee detail
    @RequestMapping(value = "/employees", method = RequestMethod.PUT)
    private Employee update(@RequestBody Employee Employee) {
        return null;
    }
}
