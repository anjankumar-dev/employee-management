🚀 Employee Management System (Spring Boot)

📌 About the Project
The **Employee Management System** is a Spring Boot application built for managing employee records.  
It provides REST APIs for CRUD operations and supports advanced filtering by department, job title, and employee ID.  
Custom exception handling ensures clean and meaningful error responses.

---

✨ Features

1.➕ **Add** a new employee  
2.🔄 **Update** existing employee details  
3.📋 **Get all** employees  
4.🏢 Filter employees by **Department**  
5.💼 Filter employees by **Job Title**  
6.🆔 Retrieve employee by **ID**  
7.⚡ Exception handling with **GlobalExceptionHandler**  
8.💾 Database integration with **MySQL**  
9.✅ **Validations** with Jakarta Bean Validation (e.g., `@NotBlank`, `@Email`, `@Past`)

---

🛠 Tech Stack

**Backend:** Java 17, Spring Boot 3.x  
**Database:** MySQL  
**Build Tool:** Maven  
**Validation:** Jakarta Bean Validation  
**Exception Handling:** @ControllerAdvice + Custom Exceptions  

---

## 📂 Project Structure

employee-management/

┣ 📂 src/main/java/com/anjan/employee_management

┃ ┣ 📂 controller # REST Controllers

┃ ┣ 📂 service # Business Logic

┃ ┣ 📂 repository # JPA Repositories

┃ ┣ 📂 entity # JPA Entities

┃ ┣ 📂 dto # Data Transfer Objects

┃ ┗ 📂 exception # Custom Exceptions + Handler

┣ 📂 src/main/resources

┃ ┗ application.properties

┗ pom.xml

| Method | Endpoint                                  | Description                 |
| ------ | ----------------------------------------- | --------------------------- |
| POST   | `/api/employee`                           | Add new employee            |
| PUT    | `/api/employees/{employeeId}`             | Update employee details     |
| GET    | `/api/employee`                           | Get all employees           |
| GET    | `/api/employee/{employeeId}`              | Get employee by ID          |
| GET    | `/api/employee/department/{department}`   | Get employees by Department |
| GET    | `/api/employee/jobtitle/{jobtitle}`       | Get employees by Job Title  |
| DELETE | `/api/employee/{employeeId}`              | Delete employee             |


👨‍💻 Author

Anjan Kumar

