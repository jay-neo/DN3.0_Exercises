package com.code.employee.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="departments")//table name thats why it is departments
@Getter
@Setter
public class Department {


	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;
	    //creating a relationship with Employee One to many
	    //In one department
	    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	    private List<Employee> employees;
	
}