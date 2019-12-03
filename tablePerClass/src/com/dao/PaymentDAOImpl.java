package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Cheque;
import com.model.CreditCard;
import com.util.HibernateUtil;

public class PaymentDAOImpl implements PaymentDAO{

	@Override
	public boolean saveCreditCard(CreditCard card) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.save(card);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
			return false;
		}
		
	}

	@Override
	public boolean saveCheque(Cheque cheque) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.save(cheque);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			transaction.rollback();
			return false;
		}
	}

}
