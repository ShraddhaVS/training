package week5;
import java.util.concurrent.locks.*;
class Counter2{
	Lock l=new ReentrantLock();
	int counter;
	public int getValue() {
		return counter;
	}
	public int increment() {
		l.lock();
		counter++;
		l.unlock();
		return counter;
	}
}
public class LocksExample {
	public static void main(String[] args) throws InterruptedException {
		Counter2 c =new Counter2();
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
		
		System.out.println(c.counter);
		
	}
}
