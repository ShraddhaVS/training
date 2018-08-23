package many.to.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEvent {
	public static void main(String[] args) {
		
		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		Delegate del1 = new Delegate();
		del1.setDelegateName("aa");
		Delegate del2 = new Delegate();
		del2.setDelegateName("bb");
		Delegate del3 = new Delegate();
		del3.setDelegateName("cc");
		Delegate del4 = new Delegate();
		del4.setDelegateName("dd");
		
		Event java =new Event();
		java.setEventName("java 101");
		Event cplus =new Event();
		cplus.setEventName("cplus 101");
		Event math =new Event();
		math.setEventName("math 101");
		
		java.getDelegate().add(del1);
		java.getDelegate().add(del2);
		java.getDelegate().add(del3);
		cplus.getDelegate().add(del2);
		cplus.getDelegate().add(del3);
		math.getDelegate().add(del4);
		
		session.save(del1);
		session.save(del2);
		session.save(del3);
		session.save(del4);
		session.save(java);
		session.save(cplus);
		session.save(math);
		session.getTransaction().commit();
	
	}
}
