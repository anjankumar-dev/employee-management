import React, { useState } from "react";
import './Header.css'

export  default function Header(){

    return(
        <>
        
            <nav className="navbar">
                <div className="logo">
                    EMS<span>.</span>
                </div>
                <div className="nav-links">
                    <a href="/">Home</a>
                    <a href="/addEmployee">Add Employee</a>
                    <a href="/viewEmployees">View Employees</a>
                </div>
            </nav>
        </>
    )
}