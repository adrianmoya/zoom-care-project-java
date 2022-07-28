package com.zoomcare.candidatechallenge.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoomcare.candidatechallenge.dto.EmployeeDto;
import com.zoomcare.candidatechallenge.model.Employee;
import com.zoomcare.candidatechallenge.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    EmployeeService employeeService;

    ModelMapper mapper;
    
    public EmployeeController(EmployeeService employeeService, ModelMapper mapper) {
        this.employeeService = employeeService;
        this.mapper = mapper;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable(value = "employeeId") Long employeeId) {
        Employee result = employeeService.getEmployeeById(employeeId);
        final EmployeeDto employeeDto = mapper.map(result, EmployeeDto.class);
        return ResponseEntity.ok(employeeDto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/toplevel")
    public ResponseEntity<List<EmployeeDto>> getTopLevelEmployees() {
        List<Employee> topLevelEmployees = employeeService.getTopLevelEmployees();
        List<EmployeeDto> topLevelEmployeesDto = topLevelEmployees.stream().map(e -> mapper.map(e, EmployeeDto.class)).collect(Collectors.toList());
        return ResponseEntity.ok(topLevelEmployeesDto);
    }

}
