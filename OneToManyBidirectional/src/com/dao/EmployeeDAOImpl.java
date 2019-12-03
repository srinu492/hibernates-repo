package com.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Address;
import com.model.Employee;
import com.util.HibernateUtil;

import javassist.expr.NewArray;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void svaeEmployee() {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Employee employee = new Employee();
		employee.setEmployeeName("srinu");
		employee.setEmail("psrjava89@gmail.com");
		employee.setDoj(new Date());
		Address address = new Address();
		address.setCity("nellore");
		address.setStreet("rajavolu");
		address.setState("ap");
		address.setPincod(524322L);
		Address address2 = new Address();
		address2.setCity("chennai");
		address2.setStreet("karunanidhi 2nd cross");
		address2.setState("TN");
		address2.setPincod(362345L);
		Set<Address> addresses=new HashSet<>();
		addresses.add(address);
		addresses.add(address2);
		employee.setAddresses(addresses);
		address.setEmployee(employee);
		address2.setEmployee(employee);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
	}

}
