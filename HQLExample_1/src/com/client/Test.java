package com.client;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;

public class Test {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		dao.getAllEmployess();
		//dao.getEmployeeById(2);
		//dao.getNameAndSalary(2);
		//dao.getAllEmployessNameAndSalary();
		//dao.getAllEmployessName();
		//dao.updateEmployeeSalary(2);
		//dao.deleteEmployee(3);
		//dao.maxSalary();
	}

}
