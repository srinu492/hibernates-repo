package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Persion;
import com.util.HibernateUtil;

public class OptimisticLockingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Persion persion = (Persion) session.get(Persion.class, 9);
		Transaction transaction=session.beginTransaction();
		persion.setPassword("reddy@123");
		session.update(persion);
		transaction.commit();
		
	}

}
