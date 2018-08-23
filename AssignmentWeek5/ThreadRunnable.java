package week5;

class Hi1 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++)
			System.out.println("Hi");
		try{Thread.sleep(1000);} catch(Exception e) {}
	}
}
class Hello1 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++)
			System.out.println("Hello");
		try{Thread.sleep(1000);} catch(Exception e) {}
	}
}
public class ThreadRunnable {
	public static void main(String[] args) {
		Hi1 ob1=new Hi1();
		Hello1 ob2=new Hello1();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		
		t1.start();
		//try{Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
	}
}

