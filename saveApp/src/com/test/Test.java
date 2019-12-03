package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.model.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("com/config/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		Product product = new Product();
		product.setProductId(105);
		product.setProductName("note 7 pro");
		product.setPrice(13999);
		Transaction transaction = session.beginTransaction();
		int id = (int) session.save(product);
		System.out.println(id);
		transaction.commit();
		factory.close();
		session.close();

	}

}
