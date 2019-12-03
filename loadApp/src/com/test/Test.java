package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.model.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("com/config/hibernate.cfg.xml");
		/*
		 * ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		 * .applySettings(configuration.getProperties()).build();
		 * 
		 * SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		 */
		@SuppressWarnings("deprecation")
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Product product = (Product) session.load(Product.class, new Integer(101));
		System.out.println(product.getProductId());
	}

}
