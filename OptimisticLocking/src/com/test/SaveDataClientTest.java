package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Persion;
import com.util.HibernateUtil;

public class SaveDataClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SessionFactory  factory=HibernateUtil.getSessionFactory();
         Session session=factory.openSession();
         Persion persion=new Persion();
         persion.setPersionName("srinu");
         persion.setPassword("reddy123");
         Persion persion2=new Persion();
         persion2.setPersionName("anish");
         persion2.setPassword("anish@123");
         Transaction transaction=session.beginTransaction();
              session.save(persion);
              session.save(persion2);
              transaction.commit();
	}

}
