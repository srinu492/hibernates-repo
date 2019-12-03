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
		Product product = new Product();
		Session session = factory.openSession();
		product = (Product) session.get(Product.class, 103);
		System.out.println(product.getPrice());
		product.setPrice(10999);
		Transaction transaction = session.beginTransaction();
		session.update(product);
		transaction.commit();
		System.out.println(product.getPrice());

	}

}
