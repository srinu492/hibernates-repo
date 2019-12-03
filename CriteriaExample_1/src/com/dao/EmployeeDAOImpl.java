package com.dao;

import java.util.List;

import org.hibernate.Criteria;
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
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> employees = criteria.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	@Override
	public void getRestications() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		// get salary greater-than 40000
		Criterion criterion = Restrictions.gt("salary", new Double(40000));
		criteria.add(criterion);
		List<Employee> employees = criteria.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	@Override
	public void getEmployeeNames() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		// criteria.setProjection(Projections.property("name"));
		Projection projection = Projections.property("name");
		criteria.setProjection(projection);
		List<String> list = criteria.list();
		for (String string : list) {
			System.out.println(string);
		}
	}

	@Override
	public void getNamesAndSalary() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Projection projection = Projections.property("name");
		Projection projection2 = Projections.property("salary");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection);
		projectionList.add(projection2);
		criteria.setProjection(projectionList);
		List<Object[]> list = criteria.list();
		for (Object[] objects : list) {
			System.out.println(objects[0] + " " + objects[1]);
		}
	}

	@Override
	public void getAggregates() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.max("salary"));
		projectionList.add(Projections.min("salary"));
		projectionList.add(Projections.avg("salary"));
		projectionList.add(Projections.count("name"));
		criteria.setProjection(projectionList);
		List<Object[]> objects = criteria.list();
		for (Object[] objects2 : objects) {
			System.out.println("max salary = " + objects2[0]);
			System.out.println("min salary = " + objects2[1]);
			System.out.println("avg salary = " + objects2[2]);
			System.out.println("count  = " + objects2[3]);
		}
	}

}
