package com.test;

import com.dao.ProjectDAO;
import com.dao.ProjectDAOImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ProjectDAO dao=new ProjectDAOImpl();
       dao.saveData();
	}

}
