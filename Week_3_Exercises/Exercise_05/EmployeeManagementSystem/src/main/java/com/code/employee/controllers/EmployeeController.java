package com.code.employee.controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.employee.entity.Employee;
import com.code.employee.repository.EmployeeRepository;

@RestController
	@RequestMapping("/api/employees")
	public class EmployeeController {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    // Create a new Employee
	    @PostMapping("/add")
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    // Get all Employees
	    @GetMapping("/")
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    // Get a single Employee by ID
	    @GetMapping("/{id}")
	    public Employee getEmployeeById(@PathVariable int id) {
	        Employee employee = employeeRepository.findById(id).get();
	        return employee;
	    }

	    // Update an Employee
	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employeeDet) {
	    	//@RequestBody=name,email,salary pass,no need to pass id since giving /id
	    	//@PathVariable is used to get the variable passed from url
	    	//http://localhost:8185/api/employee/1
	    	//@PathVariable->int id returns 1
	        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
	        if (optionalEmployee.isPresent())//whether it contains the object or not 
	        	//if not then it will replace it with a new object that is created below
	        	{
	            Employee employee = optionalEmployee.get();
	            employee.setName(employeeDet.getName());
	            employee.setEmail(employeeDet.getEmail());
	            employee.setDepartment(employeeDet.getDepartment());
	            //saving the object
	            Employee updatedEmployee = employeeRepository.save(employee);
	            //returning the object
	            return updatedEmployee;
	        } else {
	        	//returning null if no object found
	            return null;
	        }
	       
	    }

	    // Delete an Employee
	    @DeleteMapping("/delete/{id}")
	    public String deleteEmployee(@PathVariable int id) {
	        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
	        if (optionalEmployee.isPresent()) {
	            employeeRepository.delete(optionalEmployee.get());
	            return "Deleted successfully";
	        } else {
	            return "Not Deleted ";
	        }
	    }
	    //named query
	    public Employee findByEmail(@PathVariable String email)
	    {
	    	return employeeRepository.findByEmailNamed(email);
	    }
	    @GetMapping(value="department/{id}")
	    public List<Employee> findByDepartmentId(@PathVariable int id)
	    {
	    	return employeeRepository.findByDepartmentIdNamed(id);
	    }
	}