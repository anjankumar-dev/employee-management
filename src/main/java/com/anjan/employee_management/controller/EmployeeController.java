package com.anjan.employee_management.controller;

import com.anjan.employee_management.dto.EmployeeRequestDTO;
import com.anjan.employee_management.dto.EmployeeResponseDTO;
import com.anjan.employee_management.entity.EmployeeEntity;
import com.anjan.employee_management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // add an employee
    @PostMapping
    public EmployeeResponseDTO addAnEmployee(@Valid @RequestBody EmployeeRequestDTO employeeRequest){
        return service.addEmployee(employeeRequest);
    }
    // delete Employee   no permanent deletion status is inactive
    @DeleteMapping("/{employeeId}")
    public ResponseEntity<EmployeeResponseDTO> deleteEmployee(@PathVariable String employeeId){
        EmployeeResponseDTO deletedEmployee = service.deleteEmployee(employeeId);
        return ResponseEntity.ok(deletedEmployee);
    }

    // get all employees list
    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> getAllEmployees(){
        return ResponseEntity.ok(service.getAllEmployees());
    }

    // Smart search & Filters
    @GetMapping("department/{department}")
    public ResponseEntity<List<EmployeeResponseDTO>> getEmployeesByDepartment(@PathVariable String department){
        return ResponseEntity.ok(service.getEmployeesByDepartment(department));
    }

    @GetMapping("jobtitle/{jobTitle}")
    public ResponseEntity<List<EmployeeResponseDTO>> getEmployeesByJobTitle(@PathVariable String jobTitle){
        return ResponseEntity.ok(service.getEmployeesByJobTitle(jobTitle));
    }

    // get employee details by id,name
    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeResponseDTO> getEmployeeById(@PathVariable String employeeId){
        return ResponseEntity.ok(service.getEmployeeById(employeeId));
    }

    //update employee details like status, salary, job roles, etc
    @PutMapping("/{employeeId}")
    public ResponseEntity<EmployeeResponseDTO> updateEmployee(@PathVariable String employeeId,@Valid @RequestBody EmployeeRequestDTO emp){
        return ResponseEntity.ok(service.updateEmployee(employeeId,emp));
    }
}
