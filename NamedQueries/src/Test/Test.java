package Test;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("com/config/hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Query query=session.getNamedQuery("getEmployee");
		List<Employee> employees= query.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
