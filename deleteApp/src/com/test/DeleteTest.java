package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.model.Product;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("com/config/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		Product product = (Product) session.get(Product.class, 101);
		if (product == null) {
			System.out.println("object doesn't exit");
		} else {
			Transaction transaction = session.beginTransaction();
			session.delete(product);
			transaction.commit();
		}
	}

}
