package com.anjan.employee_management.dto;

import com.anjan.employee_management.entity.EmployeeEntity;

import java.time.LocalDate;

public class EditResponseDTO {
    private String employeeId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String gender;

    private String email;

    private String phoneNumber;

    private String jobTitle;

    private String department;

    private LocalDate dateOfJoining;
    private String employmentType;  // need to make this also as enum
    private EmployeeEntity.EmployeeStatus status= EmployeeEntity.EmployeeStatus.ACTIVE;
    private Double salary;

//    // employee Address
//    private String addressLine1;
//    private String addressLine2;
//    private String city;
//    private String state;
//    private String postalCode;
//    private String country;
//    private String emergencyContactName;
//    private String emergencyContactNumber;

    // System / Tracking fields

    private String createdBy;
    private String updatedBy;

    private LocalDate createdAt;

    private LocalDate updatedAt;

    // constructor
    public EditResponseDTO() {
    }

    // parameterized constructor
    public EditResponseDTO(String employeeId, String firstName, String lastName, LocalDate dateOfBirth, String gender, String email, String phoneNumber, String jobTitle, String department, LocalDate dateOfJoining, String employmentType, EmployeeEntity.EmployeeStatus status, Double salary, String createdBy, String updatedBy, LocalDate createdAt, LocalDate updatedAt) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
        this.employmentType = employmentType;
        this.status = status;
        this.salary = salary;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public EmployeeEntity.EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeEntity.EmployeeStatus status) {
        this.status = status;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public enum EmployeeStatus{
        ACTIVE, INACTIVE
    }



}


