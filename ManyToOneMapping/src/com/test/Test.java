package com.test;

import com.dao.CustomerDAO;
import com.dao.CustomerDAOImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CustomerDAO customerDAO=new CustomerDAOImpl();
     customerDAO.saveEntiy();
	}

}
