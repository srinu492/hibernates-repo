package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory = null;

	private HibernateUtil() {
	}

	public synchronized static SessionFactory getSessionFactory() {
		if (factory == null) {
			factory = new Configuration().configure("com/config/hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;

	}
}
