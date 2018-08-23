package week5;
class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
		System.out.println(count);
	}
}

public class SyncDemo {
public static void main(String[] args) throws InterruptedException {
	

	Counter c =new Counter();
	Thread t1= new Thread(new Runnable()
	{
		public void run(){
			for(int i=1;i<=10;i++) {
				c.increment();
			}
		}
	});
	
	Thread t2= new Thread(new Runnable()
	{
		public void run(){
			for(int i=1;i<=10;i++) {
				c.increment();
			}
		}
	});
	
	t1.start();
	t2.start();
	//t1.join();
	//t2.join();
	
	//System.out.println(c.count);
}
}