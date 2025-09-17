package com.anjan.employee_management.repository;

import com.anjan.employee_management.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {
    public List<EmployeeEntity> findByDepartment(String department);
    public List<EmployeeEntity> findByJobTitle(String jobTitle);

    //public EmployeeEntity findById(String employeeId);


}
