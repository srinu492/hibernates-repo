package com.test;

import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Address;
import com.model.Employee;
import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Employee employee = new Employee();
		employee.setEmployeeName("srinu");
		employee.setEmail("psrjava89@gmail.com");
		employee.setDoj(new Date());
		employee.setSalary(new Double(50000));
		Address address = new Address();
		address.setStreet("rajavolu");
		address.setCity("nellore");
		address.setState("AP");
		address.setPincod(524322L);
		employee.setAddress(address);
		Transaction transaction=session.beginTransaction();
		Integer integer=(Integer) session.save(employee);
		System.out.println(integer);
		transaction.commit();
	}

}
