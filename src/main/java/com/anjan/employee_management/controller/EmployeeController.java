package com.anjan.employee_management.controller;

import com.anjan.employee_management.entity.EmployeeEntity;
import com.anjan.employee_management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // add an employee
    @PostMapping
    public EmployeeEntity entryAnEmployee(@Valid @RequestBody EmployeeEntity employee){
        return service.entry(employee);
    }
    // delete Employee   no permanent deletion status is inactive
    @DeleteMapping("/{employeeId}")
    public ResponseEntity<EmployeeEntity> deleteEmployee(@PathVariable String employeeId){
        EmployeeEntity updatedEmployee = service.deleteEmployee(employeeId);
        return ResponseEntity.ok(updatedEmployee);
    }

    // get all employees list
    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees(){
        return ResponseEntity.ok(service.getAllEmployees());
    }

    // Smart search & Filters
    @GetMapping("department/{department}")
    public ResponseEntity<List<EmployeeEntity>> getEmployeesByDepartment(@PathVariable String department){
        return ResponseEntity.ok(service.getEmployeesByDepartment(department));
    }

    @GetMapping("jobtitle/{jobTitle}")
    public ResponseEntity<List<EmployeeEntity>> getEmployeesByJobTitle(@PathVariable String jobTitle){
        return ResponseEntity.ok(service.getEmployeesByJobTitle(jobTitle));
    }

    // get employee details by id,name
    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable String employeeId){
        return ResponseEntity.ok(service.getEmployeeById(employeeId));
    }

    //update employee details like status, salary, job roles, etc
    @PutMapping("/{employeeId}")
    public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable String employeeId,@Valid @RequestBody EmployeeEntity emp){
        EmployeeEntity updatedEmployee = service.updateEmployee(employeeId,emp);
        return ResponseEntity.ok(updatedEmployee);
    }
}
