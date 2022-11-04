package com.accolite.problem2.repository;

import com.accolite.problem2.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employee, Integer> {
}
