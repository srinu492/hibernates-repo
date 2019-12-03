package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Persion;
import com.util.HibernateUtil;

public class SimulateOptimisticLocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Transaction transaction = null;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Session session = factory.openSession();
				Persion persion = (Persion) session.get(Persion.class, 9);
				transaction = session.beginTransaction();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				persion.setPassword("srinu123");
				session.update(persion);
				transaction.commit();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			SessionFactory factory1 = HibernateUtil.getSessionFactory();

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Session session1 = factory1.openSession();
				Persion persion1 = (Persion) session1.get(Persion.class, 9);
				Transaction transaction = session1.beginTransaction();
				persion1.setPassword("srinu@123");
				session1.update(persion1);
				transaction.commit();
			}
		});
		thread.start();
		thread2.start();
	}

}
