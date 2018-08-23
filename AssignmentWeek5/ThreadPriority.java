package week5;



public class ThreadPriority {
public static void main(String[] args) throws InterruptedException {
	

	Thread t1= new Thread(new Runnable()
	{
		public void run(){
			for(int i=1;i<=10;i++) {
				System.out.println("Hello");
				
			}
		}
	},"First");
	
	Thread t2= new Thread(new Runnable()
	{
		public void run(){
			for(int i=1;i<=10;i++) {
				System.out.println("Hi");
			}
		}
	
	},"Second");
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	t1.setPriority(1);
	t2.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	t1.start();
	//t1.join();
	Thread.yield();
	t2.start();
	
	
	//t2.join();
	

}
}