import { useState } from 'react'
import './App.css'
import AddEmployee from './components/AddEmployee';
import ViewEmployee from './components/ViewEmployees';
import { Route, Routes } from 'react-router-dom';
import ViewEmployees from './components/ViewEmployees';



function App() {
  const [employees, setEmployees] = useState([])

  return (
    <>
      <Routes>
        <Route path='/addEmployee' Component={AddEmployee}/>
        <Route path='/viewEmployees' Component={ViewEmployees}/>
      </Routes>
      
    </>
  )
}

export default App
