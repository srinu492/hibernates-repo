package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Department;
import com.util.HibernateUtil;

public class Test {
	public static void fetchData() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("from Department").setCacheable(true);
		List<Department> departments = query.list();
		for (Department department : departments) {
			System.out.println(department.getDeptName());
		}
		System.out.println("....................");
		Session session2 = factory.openSession();
		Query query2 = session.createQuery("from Department").setCacheable(true);
		List<Department> departments2 = query2.list();
		for (Department department : departments2) {
			System.out.println(department.getDeptName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Department department = (Department) session.get(Department.class, 26);
		System.out.println(department.getDeptName());
		Session session2 = factory.openSession();
		Department department2 = (Department) session2.get(Department.class, 26);
		System.out.println(department.getDeptName());
		fetchData();
	}

}
