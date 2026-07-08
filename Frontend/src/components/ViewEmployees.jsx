import { useEffect, useState } from "react";
import "./viewemployees.css"
import axios from "axios";
import { useNavigate } from "react-router-dom";
import AddEmployee from "./AddEmployee";


function ViewEmployees(){
    const [employees, setEmployees] = useState([])

    useEffect(() => {
        fetch("http://localhost:8080/api/employee")
        .then((res) => res.json())
        .then((data) => setEmployees(data))
        .catch((error) => console.error(error));
    },[])

    const deleteEmployee = (employeeId) => {
        axios.delete(`http://localhost:8080/api/employee/${employeeId}`)
        .then(()=>{
            window.confirm(`Are you sure! to delete employee with id ${employeeId}`);
        }).catch((err)=>{
            alert(err);
        })
    }

    const navigator = useNavigate();
    const editEmployee = (employeeId) => {
        console.log(`edit button clicked for : ${employeeId}`);
        navigator("/addEmployee");
    }

    return(
        <>
        <div className="view-container">
            <div><h1>Employees Data</h1></div>
            <div className="view-card">
                <table className="employee-table">
                    <thead>
                        <tr>
                            <th>Employee Id</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Date Of Birth</th>
                            <th>Job Title</th>
                            <th>Department</th>
                            <th>Salary</th>
                            <th>Status</th>
                            <th>Actions</th>
                        </tr>
                </thead>
                <tbody>
                { employees.map((emp) => (
                <tr>
                    <td>{emp.employeeId}</td>
                    <td>{emp.firstName}</td>
                    <td>{emp.lastName}</td>
                    <td>{emp.dateOfBirth}</td>
                    <td>{emp.jobTitle}</td>
                    <td>{emp.department}</td>
                    <td>{emp.salary}</td>
                    <td>{emp.status}</td>
                    <td>
                        <div className="btn-group">
                            <button className="edit-btn" onClick={() =>{
                                editEmployee(emp.employeeId)
                            }}>Edit</button>
                            <button className="delete-btn" onClick={() => 
                                deleteEmployee(emp.employeeId)
                            }>Delete</button>
                        </div>
                    </td>
                </tr>))
                }
                </tbody>
            </table>
            </div>
        </div>
        </>
    )
}

export default ViewEmployees;