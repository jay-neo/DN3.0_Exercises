package com.code.employee.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

//import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.code.employee.entity.Department;
import com.code.employee.entity.Employee;
import com.code.employee.projection.EmployeeProjection;
import com.code.employee.projection.EmployeeValueProjection;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//Using the named query defined in Employee entity
	@Query(name="Employee.findByEmail")
	Employee findByEmailNamed(@Param("email")String email);
	//email is unique so we are not using List
	//in employee in email, unique=true
	
	//Using the named query defined in Employee entity
	@Query(name="Employee.findByDepartmentId")
	List<Employee> findByDepartmentIdNamed(@Param("departmentId")int departmentId);
	//under one department there can be many employees so we are using List
	
	Page<Employee> findAll(Pageable pageable);
	Page<Employee> findByDepartmentId(int departmentId, Pageable pageable);
	
	//adding the query for employee projection
	@Query("SELECT e.name as name, e.salary as salary FROM Employee e")
	List<EmployeeProjection> findByEmployee();
//	
	@Query("SELECT e.name as name, e.salary as salary FROM Employee e where e.department.name = :departmentName")
	List<EmployeeValueProjection> findByDepartmentName(@Param("departmentName") String departmentName);
}
