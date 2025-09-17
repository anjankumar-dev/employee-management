package com.anjan.employee_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class EmployeeRequestDTO {

    private Long employeeId;


    @NotBlank(message = "First name is must not empty, null and blank")
    private String firstName;
    @NotBlank(message = "Last name is must not empty, null and blank")
    private String lastName;
    @Past(message = "Dob should be past")
    private LocalDate dateOfBirth;
    @NotBlank
    private String gender;
    @Email(message = "Email must be valid")
    @NotBlank(message = "Not blank")
    private String email;
//    @Pattern(regexp ="^[6-9]\d{9}$",message = "")

    private String phoneNumber;

    // job/  work
    @NotBlank(message = "must be mention")
    private String jobTitle;
    @NotBlank
    private String department;
    @Past(message = "Date should be past")
    private LocalDate dateOfJoining;
    @NotBlank
    private String employmentType;
    @NotBlank
    private String status;

    // salary and compensations
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

    @PastOrPresent
    private LocalDate createdBy;

    @PastOrPresent
    private LocalDate updatedBy;


    @PastOrPresent
    private LocalDate createdAt;
    @PastOrPresent
    private LocalDate updatedAt;

    // constructor


    public EmployeeRequestDTO() {
    }

    public EmployeeRequestDTO(Long employeeId, String firstName, String lastName, LocalDate dateOfBirth, String gender, String email, String phoneNumber, String jobTitle, String department, LocalDate dateOfJoining, String employmentType, String status, Double salary, LocalDate createdBy, LocalDate updatedBy, LocalDate createdAt, LocalDate updatedAt) {
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
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LocalDate createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(LocalDate updatedBy) {
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
}
