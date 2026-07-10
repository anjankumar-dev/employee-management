import React, { useEffect, useState } from "react";
import "./AddEmployee.css"
import axios from "axios";
import Header from "../common-components/Header";
import Footer from "../common-components/Footer";
import { useParams } from "react-router-dom";

export default function UpdateEmployee(){

    const [employee, setEmployee] = useState({
        firstName: "",
        lastName: "",
        dateOfBirth: "",
        gender: "",
        email: "",
        phoneNumber: "",
        jobTitle: "",
        department: "",
        dateOfJoining: "",
        employmentType: "",
        status: "ACTIVE",
        salary: "",
        createdBy:"",
        updatedBy:"",
        createdAt:"",
        updatedAt:""
    });

    const [employees, setEmployees] = useState([]);

    const {employeeId} = useParams();

    console.log(`employeeId ${employeeId}`);
    useEffect(()=>{
        axios.get(`http://localhost:8080/api/employee/edit/${employeeId}`)
        .then((res)=>setEmployee(res.data))
        .catch((error) => console.error(error))
    },[])

    const handleChange = (e) => {

        setEmployee({
        ...employee,
        [e.target.name]: e.target.value,
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
    
        axios.patch(
            `http://localhost:8080/api/employee/${
            employeeId}`,employee
        )
        .then((response) => setEmployees(response.data))
        .catch((error) => {
            console.error(error);
            alert(error.response.data)
        })

        console.log("submitted for update")
    };


    return(
        <>
            <Header/> 

            <div className="employee-container">
                <div className="employee-card">
                    <h2>Employee Registration</h2>

                    <form action="" method="POST" onSubmit={handleSubmit}>
                        <div className="form-grid">
                            <div className="form-group">
                                <label>First Name</label>
                                <input type="text" name="firstName" 
                                value={employee.firstName} onChange={handleChange} />
                            </div>
                            
                             <div className="form-group">
                                <label>Last Name</label>
                                <input type="text" name="lastName" 
                                    value={employee.lastName} onChange={handleChange}
                                />
                                </div>

                                <div className="form-group">
                                <label>Date of Birth</label>
                                <input type="date" name="dateOfBirth"
                                    value={employee.dateOfBirth} onChange={handleChange}
                                />
                                </div>

                                <div className="form-group">
                                <label>Gender</label>
                                <select name="gender" value={employee.gender} onChange={handleChange}
                                >
                                    <option value="">Select</option>
                                    <option value="male">Male</option>
                                    <option value="female">Female</option>
                                </select>
                                </div>

                                <div className="form-group">
                                <label>Email</label>
                                <input type="email" name="email"
                                    value={employee.email} onChange={handleChange}
                                />
                                </div>

                                <div className="form-group">
                                <label>Phone Number</label>
                                <input type="text" name="phoneNumber"
                                    value={employee.phoneNumber} onChange={handleChange}
                                />
                                </div>

                                <div className="form-group">
                                <label>Job Title</label>
                                <input type="text" name="jobTitle"
                                    value={employee.jobTitle} onChange={handleChange}
                                />
                                </div>

                                <div className="form-group">
                                <label>Department</label>
                                <input type="text" name="department"
                                    value={employee.department} onChange={handleChange}
                                />
                                </div>

                                <div className="form-group">
                                <label>Date Of Joining</label>
                                <input type="date" name="dateOfJoining"
                                    value={employee.dateOfJoining} onChange={handleChange}
                                />
                                </div>

                                <div className="form-group">
                                <label>Employment Type</label>
                                <select
                                    name="employmentType"
                                    value={employee.employmentType} onChange={handleChange}
                                >
                                    <option value="">Select</option>
                                    <option value="full-time">Full Time</option>
                                    <option value="part-time">Part Time</option>
                                    <option value="contract">Contract</option>
                                </select>
                                </div>

                                <div className="form-group">
                                <label>Status</label>
                                <select
                                    name="status" value={employee.status} onChange={handleChange}
                                >
                                    <option value="ACTIVE">ACTIVE</option>
                                    <option value="INACTIVE">INACTIVE</option>
                                </select>
                                </div>

                                <div className="form-group">
                                <label>Salary</label>
                                <input type="number" name="salary"
                                    value={employee.salary} onChange={handleChange}
                                />
                                </div>
                                <div className="form-group">
                                <label>Created By</label>
                                <input type="text" name="createdBy"
                                    value={employee.createdBy} onChange={handleChange}
                                />
                                </div>
                                <div className="form-group">
                                <label>Updated By</label>
                                <input type="text" name="updatedBy"
                                    value={employee.updatedBy} onChange={handleChange}
                                />
                                </div>
                                <div className="form-group">
                                <label>Created At</label>
                                <input type="date" name="createdAt"
                                    value={employee.createdAt} onChange={handleChange}
                                />
                                </div>
                                <div className="form-group">
                                <label>Updated At</label>
                                <input type="date" name="updatedAt"
                                    value={employee.updatedAt} onChange={handleChange}
                                />
                                </div>
                        </div>
                        <button type="submit" className="submit-btn">
                            Save Employee
                        </button>
                    </form>
                </div>
                
            </div>

            <Footer/>
        </>
    );
}