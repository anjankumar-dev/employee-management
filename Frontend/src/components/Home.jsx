import React from "react";
import './Home.css'
import { useNavigate } from "react-router-dom";
import Header from "../common-components/Header";
import Footer from "../common-components/Footer";

export default function Home(){

    const navigate = useNavigate();

    const goToAddEmployee =() => {
        navigate('/addEmployee');
    }

    const goToViewEmployees =() => {
        navigate('/viewEmployees')
    }

    return(

        <>
            <Header/>
            <div className="home-container">
                <h1>Employee Management System</h1>
                <div className="btn-container">
                    <button className="btn" onClick={() => goToAddEmployee() }>Add Employee</button>
                    <button className="btn" onClick={() => goToViewEmployees() }>View Employees</button>
                </div>
            </div>

            <Footer/>
        </>
    )
}