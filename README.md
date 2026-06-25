# 👨‍💼 Employee Management System

<div align="center">

<img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk" />
<img src="https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=springboot" />
<img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql" />
<img src="https://img.shields.io/badge/Maven-Build_Tool-red?style=for-the-badge&logo=apachemaven" />
<img src="https://img.shields.io/badge/REST-API-purple?style=for-the-badge" />

<h3>🚀 A Robust Spring Boot REST API for Employee Management</h3>

</div>

---

## 📖 About The Project

The **Employee Management System** is a backend application built using **Spring Boot** that helps organizations efficiently manage employee records through RESTful APIs.

The application supports complete employee lifecycle management, including creation, retrieval, updates, deletion, and advanced filtering. It also implements DTO-based architecture, data validation, and global exception handling to ensure clean, scalable, and production-ready code.

### 🎯 Key Learning Outcomes

- ✅ Building RESTful APIs using Spring Boot
- ✅ Layered Architecture (Controller → Service → Repository)
- ✅ DTO-Based Request & Response Handling
- ✅ MySQL Database Integration with Spring Data JPA
- ✅ Global Exception Handling using `@ControllerAdvice`
- ✅ Data Validation using Jakarta Bean Validation
- ✅ Clean Code & Best Practices

---

## ✨ Features

### 👨‍💼 Employee Management

- ➕ Add New Employee
- 🔄 Update Existing Employee
- 🗑 Delete Employee
- 📋 Retrieve All Employees
- 🆔 Retrieve Employee by ID

### 🔍 Advanced Filtering

- 🏢 Filter Employees by Department
- 💼 Filter Employees by Job Title

### ⚡ Reliability & Validation

- ✅ Input Validation using Jakarta Bean Validation
- ⚠️ Global Exception Handling
- 📦 DTO-Based Data Transfer
- 💾 Persistent Storage with MySQL

---

## 🛠 Tech Stack

| Category | Technology |
|-----------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| Database | MySQL |
| ORM | Spring Data JPA |
| Validation | Jakarta Bean Validation |
| Exception Handling | ControllerAdvice & Custom Exceptions |
| Build Tool | Maven |
| API Style | RESTful APIs |
| Version Control | Git & GitHub |

---

# 📡 API Endpoints

## Employee APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| 🟢 POST | `/api/employee` | Create a new employee |
| 🔵 GET | `/api/employee` | Retrieve all employees |
| 🔵 GET | `/api/employee/{employeeId}` | Retrieve employee by ID |
| 🔵 GET | `/api/employee/department/{department}` | Retrieve employees by department |
| 🔵 GET | `/api/employee/jobtitle/{jobtitle}` | Retrieve employees by job title |
| 🟡 PATCH | `/api/employees/{employeeId}` | Update employee details |
| 🔴 DELETE | `/api/employee/{employeeId}` | Delete employee |

---

## 🗄 Database Design

### Employee Entity

| Field | Type |
|---------|------|
| employeeId | Long |
| firstName | String |
| lastName | String |
| email | String |
| phoneNumber | String |
| department | String |
| jobTitle | String |
| salary | Double |
| dateOfBirth | LocalDate |
| createdAt | LocalDateTime |
| updatedAt | LocalDateTime |

---

## 📂 Project Structure

```text
employee-management-system/
│
├── src/main/java
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── dto
│   └── exception
│
├── src/main/resources
│   └── application.properties
│
├── pom.xml
└── README.md
```

---

## 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/your-username/employee-management-system.git
```

### Configure Database

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

## 📸 API Screenshots

### Add your screenshots here

```md
![Add Employee](screenshots/add-employee.png)

![Get Employees](screenshots/get-employees.png)

![Database](screenshots/database.png)
```

---

## 🌱 Future Enhancements

- 🔐 JWT Authentication & Authorization
- 📄 Pagination & Sorting
- 🔍 Search APIs
- 🐳 Docker Support
- ☁️ AWS Deployment
- 📊 Monitoring & Logging
- 📖 Swagger/OpenAPI Documentation

---

## 👨‍💻 Author

# Anjan Kumar

### Java Backend Developer

💻 Passionate about Java, Spring Boot, REST APIs, SQL, and Backend Engineering.

⭐ If you found this project useful, consider giving it a star!