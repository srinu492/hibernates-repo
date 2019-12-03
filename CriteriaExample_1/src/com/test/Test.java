package com.test;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAOImpl();
		dao.getAllEmployess();
        dao.getRestications();
        dao.getEmployeeNames();
        dao.getNamesAndSalary();
        dao.getAggregates();
	}

}
