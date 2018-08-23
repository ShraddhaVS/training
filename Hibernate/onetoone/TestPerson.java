package one.to.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPerson {
	
	public static void main(String[] args) {
		
	
	SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
	Session session = sfactory.openSession();
	session.beginTransaction();
	
	PersonDetail aDetail= new PersonDetail();
	aDetail.setIncome(83293.46);
	aDetail.setJob("Engineer");
	aDetail.setZipCode("570009");
	
	Person a=new Person();
	a.setpDetail(aDetail);
	a.setPersonName("Alex");
	
	
	session.save(a);
	session.getTransaction().commit();
}
}