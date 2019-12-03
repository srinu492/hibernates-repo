package com.test;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Passport;
import com.model.Persion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SessionFactory factory=new Configuration().configure("com/config/hibernate.cfg.xml").buildSessionFactory();
      Session session=factory.openSession();
      Persion persion=new Persion();
      persion.setPersionName("srinu");
      Calendar calendar=Calendar.getInstance();
      calendar.set(2020, 7, 20);
      Date date=calendar.getTime();
      Passport passport=new Passport();
      passport.setExpireDate(date);
      passport.setPersion(persion);
      Transaction transaction=session.beginTransaction();
    		  session.save(passport);
      transaction.commit();
	}

}
