package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.King;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		King king = new King();
		king.setName("srinu");
		Configuration configuration = new Configuration();
		configuration.configure("com/config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = (int) session.save(king);
		System.out.println(id);
		transaction.commit();
		session.close();
		factory.close();
	}

}
