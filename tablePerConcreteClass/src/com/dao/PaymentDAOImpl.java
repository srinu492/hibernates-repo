package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Cheque;
import com.model.CreditCard;
import com.util.HibernateUtil;

public class PaymentDAOImpl implements PaymentDAO {

	@Override
	public void saveCreditCard(CreditCard card) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = (int) session.save(card);
		System.out.println(id);
		transaction.commit();

	}

	@Override
	public void saveCheque(Cheque cheque) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = (int) session.save(cheque);
		System.out.println(id);
		transaction.commit();
	}

}
