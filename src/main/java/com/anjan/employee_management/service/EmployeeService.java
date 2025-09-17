package com.anjan.employee_management.service;

import com.anjan.employee_management.entity.EmployeeEntity;
import com.anjan.employee_management.exception.EmployeeNotFoundException;
import com.anjan.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    // entry of an employee
    public EmployeeEntity entry(EmployeeEntity employee){
        return repo.save(employee);
    }

    // getting all employees
    public List<EmployeeEntity> getAllEmployees(){
        List<EmployeeEntity> employees = repo.findAll();
        if(employees.isEmpty()){
            throw new EmployeeNotFoundException("No employees found");
        }
        return employees;
    }

    // retrieving employees by department
    public List<EmployeeEntity> getEmployeesByDepartment(String department) {
        List<EmployeeEntity> employees = repo.findByDepartment(department);
        if(employees.isEmpty()){
            throw new EmployeeNotFoundException("Employees not found with this department: "+department);
        }
        return employees;
    }

    // retrieving employees by job title
    public List<EmployeeEntity> getEmployeesByJobTitle(String jobTitle) {

        List<EmployeeEntity> employees = repo.findByJobTitle(jobTitle);
        if(employees.isEmpty()){
            throw new EmployeeNotFoundException("Employees not found with this jobTitle: "+jobTitle);
        }
        return employees;
    }

    // get employee details with Id
    public EmployeeEntity getEmployeeById(String employeeId) {
        return repo.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("employee Not found with id: "+employeeId));
    }

    //update employee
    public EmployeeEntity updateEmployee(String employeeId, EmployeeEntity updatedEmployee) {
        return repo.findById(employeeId).map(emp -> {
            emp.setEmail(updatedEmployee.getEmail());
            return repo.save(emp);
        }).orElseThrow(()->new EmployeeNotFoundException("employee Not found with id: "+employeeId));
    }

    // deleting an employee
    public EmployeeEntity deleteEmployee(String employeeId) {
        return repo.findById(employeeId).map(emp ->{
            emp.setStatus(EmployeeEntity.EmployeeStatus.INACTIVE);
            return repo.save(emp);
        }).orElseThrow(()-> new EmployeeNotFoundException("employee Not found with id: "+employeeId));
    }
}
