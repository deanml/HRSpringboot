package com.example.hr.controllers;

import com.example.hr.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.hr.model.Employee;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController<employees> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable("id") Long id) {
        return employeeRepository.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeRepository.deleteById(id);
    }
}
