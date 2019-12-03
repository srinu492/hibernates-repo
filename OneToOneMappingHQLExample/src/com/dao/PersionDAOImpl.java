package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Passport;
import com.model.Persion;
import com.util.HibernateUtil;

public class PersionDAOImpl implements PersionDAO {
	SessionFactory factory = HibernateUtil.getSessionFactory();

	@Override
	public void getPersionAndPassportByPassportId(int id) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session
				.createQuery("from Passport passport LEFT JOIN FETCH passport.persion where passport.passportId=:id");
		query.setParameter("id", id);
		Passport passport = (Passport) query.uniqueResult();
		System.out.println(passport);
		Persion persion = passport.getPersion();
		System.out.println(persion);
	}

	@Override
	public void getPersionNameAndPassportExpireDate(int id) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery(
				"select passport.expireDate ,per.persionName from Passport passport LEFT JOIN  passport.persion per where passport.passportId=:id");
		query.setParameter("id", id);
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

}