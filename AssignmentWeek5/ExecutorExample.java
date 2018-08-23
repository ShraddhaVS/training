package week5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
	public static void main(String[] args) {	
	ExecutorService es=Executors.newFixedThreadPool(10);
	for(int i=0;i<100;i++) {
		es.execute(new Task());
	}
	System.out.println("Thread name"+Thread.currentThread().getName());
}
	static class Task implements Runnable{

		@Override
		public void run() {
			System.out.println("Thread name"+Thread.currentThread().getName());
			
		}
		
	}
}