package com.test;

import com.dao.PersionDAO;
import com.dao.PersionDAOImpl;

public class HQLClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersionDAO dao = new PersionDAOImpl();
        dao.getPersionAndPassportByPassportId(7);
        dao.getPersionNameAndPassportExpireDate(7);
	}

}
