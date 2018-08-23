package one.to.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudent {
	public static void main(String[] args) {
		

		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		
		College col=new College();
		col.setCollegeName("vvce");

		Student s1=new Student();
		s1.setCollege(col);
		s1.setStudentName("aa");
		
		Student s2= new Student();
		s2.setCollege(col);
		s2.setStudentName("bb");
		
		
		session.save(s1);
		session.save(s2);
		session.save(col);
		
		session.getTransaction().commit();
	}
}
