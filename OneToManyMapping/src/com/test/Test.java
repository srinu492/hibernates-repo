package com.test;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAOImpl();
		//dao.saveEmployee();
		dao.fetchData(23);
		//dao.removeChild(28);
		//dao.readData();
		//dao.addChild(26);
	}

}
