package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;
import com.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	SessionFactory factory = HibernateUtil.getSessionFactory();

	@Override
	public void getAllEmployess() {
		Session session = factory.openSession();
		SQLQuery query = session.createSQLQuery("select * from employee");
		query.addEntity(Employee.class);
		List<Employee> employees = query.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public void getNamesAndSalary() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		SQLQuery query = session.createSQLQuery("select emp_name,salary from employee");
		query.addScalar("emp_name");
		query.addScalar("salary");
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}

	}
}
