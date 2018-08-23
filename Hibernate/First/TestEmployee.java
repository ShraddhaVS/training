package com.hibernate.chapter1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee te= new Employee();
		te.setEmpName("aa");
		te.setEmpID(1);
		
		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		
		session.save(te);
		session.getTransaction().commit();
	}

}
