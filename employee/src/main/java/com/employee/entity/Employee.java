package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@Column(name = "employeeId")
	private int employeeId;
	@Column(name="employeeName")
	private String employeeName;
	
	@Column(name="employeeSalary")
	private Long employeeSalary;
	
	@Column(name="employeeEmail")
	private String employeeEmail;
	
	@Column(name = "employeeContactNo")
	private String employeeContactNo;

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Long getEmployeeSalary() {
		return employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public String getEmployeeContactNo() {
		return employeeContactNo;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeSalary(Long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public void setEmployeeContactNo(String employeeContactNo) {
		this.employeeContactNo = employeeContactNo;
	}

	public Employee(int employeeId, String employeeName, Long employeeSalary, String employeeEmail,
			String employeeContactNo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.employeeContactNo = employeeContactNo;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
