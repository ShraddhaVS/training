package week5;

import java.util.concurrent.atomic.AtomicInteger;

class Counter1
{
	AtomicInteger count=new AtomicInteger() ;
	public void increment()
	{
		count.getAndIncrement();
	}
}

public class AtomicIntExample {
public static void main(String[] args) throws InterruptedException {

	Counter1 c =new Counter1();
	Thread t1= new Thread(new Runnable()
	{
		public void run(){
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		}
	});
	
	Thread t2= new Thread(new Runnable()
	{
		public void run(){
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		}
	});
	
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	
	System.out.println(c.count);
}
}