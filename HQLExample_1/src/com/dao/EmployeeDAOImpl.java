package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	SessionFactory factory = HibernateUtil.getSessionFactory();

	@Override
	public void getAllEmployess() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> employess = query.list();
		for (Employee employee : employess) {
			System.out.println(employee);
		}
	}

	@Override
	public void getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("from Employee e where e.id=?");
		query.setParameter(0, id);
		Employee employee = (Employee) query.uniqueResult();
		System.out.println(employee);
		session.close();
	}

	@Override
	public void getNameAndSalary(int id) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("select name,salary from Employee where id=?");
		query.setParameter(0, 2);
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
		session.close();
	}

	@Override
	public void getAllEmployessNameAndSalary() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("select name,salary from Employee");
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			String names = (String) objects[0];
			Double salary = (Double) objects[1];
			System.out.println("names--" + names + "  salary---" + salary);
		}
		session.close();
	}

	@Override
	public void getAllEmployessName() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("select name from Employee");
		List<String> list = query.list();
		for (String string : list) {
			System.out.println(string);
		}
		session.close();
	}

	@Override
	public void updateEmployeeSalary(int id) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("update Employee set salary=:salary where id=:id");
		query.setParameter("salary", new Double(80000));
		query.setParameter("id", id);
		Transaction transaction = session.beginTransaction();
		int i = query.executeUpdate();
		transaction.commit();

		System.out.println(i);
		session.close();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("delete from Employee where id=?");
		query.setParameter(0, id);
		Transaction transaction = session.beginTransaction();
		query.executeUpdate();
		transaction.commit();
		session.close();
	}

	@Override
	public void maxSalary() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("select MAX(salary) from Employee");
		Object maxSalary = query.executeUpdate();
		System.out.println(maxSalary);
		session.close();
	}

}
