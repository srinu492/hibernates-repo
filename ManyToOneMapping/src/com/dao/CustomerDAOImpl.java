package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Customer;
import com.model.Item;
import com.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void saveEntiy() {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Customer customer = new Customer();
		customer.setName("srinu");
		customer.setAdddress("rajavolu");
		Item item = new Item();
		item.setItemName("LG");
		item.setPrice(new Double(25000));
		Item item2 = new Item();
		item2.setItemName("one plus");
		item2.setPrice(new Double(32999));
		item.setCustomer(customer);
		item2.setCustomer(customer);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(item);
		session.save(item2);
		transaction.commit();
	}

}
