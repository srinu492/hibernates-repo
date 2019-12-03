package com.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Employee;
import com.model.Project;
import com.util.HibernateUtil;

public class ProjectDAOImpl implements ProjectDAO {

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Project project = new Project();
		Project project2 = new Project();
		project.setProjectName("Hospital management");
		project2.setProjectName("Banking Project");
		Employee employee = new Employee();
		employee.setEmployeeName("srinu1");
		employee.setDoj(new Date());
		employee.getProjects().add(project);
		employee.getProjects().add(project2);
		Employee employee2 = new Employee();
		employee2.setEmployeeName("anish1");
		employee2.setDoj(new Date());
		employee2.getProjects().add(project);
		employee2.getProjects().add(project2);
	
		Employee employee3 = new Employee();
		employee3.setEmployeeName("najeeb1");
		employee3.setDoj(new Date());
		employee3.getProjects().add(project);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		session.save(employee2);
		session.save(employee3);
		transaction.commit();
	}

}
