package com.code.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.code.employee.entity.Department;
import com.code.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//derived query methods
	List<Employee> findByName(String name);
	List<Employee> findByDepartmentId(int departmentId);
	List<Employee> findByEmail(String email);
}
