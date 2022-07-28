package com.zoomcare.candidatechallenge.service;

import java.util.List;

import com.zoomcare.candidatechallenge.model.Employee;

public interface EmployeeService {
    
    Employee getEmployeeById(Long id);

    List<Employee> getTopLevelEmployees();

}
