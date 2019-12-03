package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.model.Product;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("com/config/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		Product product = (Product) session.get(Product.class, 104);
		System.out.println(product.getPrice());
		session.close();
		product.setPrice(15999);
		System.out.println("hii");
		Session session2 = factory.openSession();
		Product product2 = (Product) session2.get(Product.class, 104);
		Transaction transaction = session2.beginTransaction();
		session2.update(product);
		transaction.commit();

	}

}
