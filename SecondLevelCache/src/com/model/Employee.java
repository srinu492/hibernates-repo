package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee {
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	@Column(name = "employee_name", length = 50, nullable = false)
	private String employeeName;
	@Column(name = "doj")
	private Date dateOfJoining;
	@Column(name = "address", length = 50, nullable = false)
	private String address;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfJoining="
				+ dateOfJoining + ", address=" + address + "]";
	}

}
