    package com.anjan.employee_management.service;

    import com.anjan.employee_management.dto.EmployeeRequestDTO;
    import com.anjan.employee_management.dto.EmployeeResponseDTO;
    import com.anjan.employee_management.entity.EmployeeEntity;
    import com.anjan.employee_management.exception.EmployeeNotFoundException;
    import com.anjan.employee_management.repository.EmployeeRepository;
    import org.modelmapper.ModelMapper;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class EmployeeService {

        private final EmployeeRepository repo;

        private final ModelMapper modelMapper;

        public EmployeeService(EmployeeRepository repo, ModelMapper modelMapper){
            this.repo = repo;
            this.modelMapper = modelMapper;
        }


        public EmployeeResponseDTO addEmployee(EmployeeRequestDTO requestDTO) {
            // DTO → Entity
            EmployeeEntity entity = modelMapper.map(requestDTO, EmployeeEntity.class);

            // Save entity
            EmployeeEntity savedEntity = repo.save(entity);

            // Entity → ResponseDTO
            return modelMapper.map(savedEntity, EmployeeResponseDTO.class);
        }


        // getting all employees
        public List<EmployeeResponseDTO> getAllEmployees(){
            List<EmployeeEntity> employees = repo.findAll();
            if(employees.isEmpty()){
                throw new EmployeeNotFoundException("No employees found");
            }

            return employees.stream().map(employee -> modelMapper.map(employee,EmployeeResponseDTO.class)).toList();
        }

        // retrieving employees by department
        public List<EmployeeResponseDTO> getEmployeesByDepartment(String department) {
            List<EmployeeEntity> employees = repo.findByDepartment(department);
            if(employees.isEmpty()){
                throw new EmployeeNotFoundException("No employees found with department: "+department);
            }

            return employees.stream().map(employee -> modelMapper.map(employee,EmployeeResponseDTO.class)).toList();
        }

        // retrieving employees by job title
        public List<EmployeeResponseDTO> getEmployeesByJobTitle(String jobTitle) {

            List<EmployeeEntity> employees = repo.findByJobTitle(jobTitle);
            if(employees.isEmpty()){
                throw new EmployeeNotFoundException("No employees found with jobTitle: "+jobTitle);
            }

            return employees.stream().map(employee -> modelMapper.map(employee,EmployeeResponseDTO.class)).toList();
        }

        // get employee details with Id
        public EmployeeResponseDTO getEmployeeById(String employeeId) {
            EmployeeEntity emp = repo.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("employee Not found with id: "+employeeId));
            return modelMapper.map(emp,EmployeeResponseDTO.class);
        }

        //update employee
        public EmployeeResponseDTO updateEmployee(String employeeId, EmployeeRequestDTO updatedEmployee) {
            EmployeeEntity employee = repo.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("employee Not found with id: "+employeeId));

            // firstname
            if(updatedEmployee.getFirstName() != null) {
                employee.setFirstName(updatedEmployee.getFirstName());
            }

            // updating Lastname
            if(updatedEmployee.getLastName() != null) {
                employee.setLastName(updatedEmployee.getLastName());
            }

            // updating DOB
            if(updatedEmployee.getDateOfBirth() != null) {
                employee.setDateOfBirth(updatedEmployee.getDateOfBirth());
            }

            // updating Gender
            if(updatedEmployee.getGender() != null) {
                employee.setGender(updatedEmployee.getGender());
            }

            // updating email
            if(updatedEmployee.getEmail() != null) {
                employee.setEmail(updatedEmployee.getEmail());
            }

            // updating phone number
            if(updatedEmployee.getPhoneNumber() != null) {
                employee.setPhoneNumber(updatedEmployee.getPhoneNumber());
            }

            // job title
            if(updatedEmployee.getJobTitle() != null) {
                employee.setJobTitle(updatedEmployee.getJobTitle());
            }

            // updating  department
            if(updatedEmployee.getDepartment() != null) {
                employee.setDepartment(updatedEmployee.getDepartment());
            }

            // updating employment type
            if(updatedEmployee.getEmploymentType() != null) {
                employee.setEmploymentType(updatedEmployee.getEmploymentType());
            }

            // updating status
            if(updatedEmployee.getStatus() != null) {
                employee.setStatus(updatedEmployee.getStatus());
            }

            // updating salary
            if(updatedEmployee.getSalary() != null) {
                employee.setSalary(updatedEmployee.getSalary());
            }

            // updatedBy and updatedAt
            employee.setUpdatedBy(updatedEmployee.getUpdatedBy());
            employee.setUpdatedAt(updatedEmployee.getUpdatedAt());


            EmployeeEntity saved = repo.save(employee);
            return modelMapper.map(saved,EmployeeResponseDTO.class);
        }

        // deleting an employee
        public EmployeeResponseDTO deleteEmployee(String employeeId) {
            EmployeeEntity emp = repo.findById(employeeId).orElseThrow(()-> new EmployeeNotFoundException("employee Not found with id: "+employeeId));
            emp.setStatus(EmployeeEntity.EmployeeStatus.INACTIVE);
            EmployeeEntity saved = repo.save(emp);
            return modelMapper.map(saved,EmployeeResponseDTO.class);
        }
    }
