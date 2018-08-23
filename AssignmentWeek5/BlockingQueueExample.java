package week5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
public static void main(String[] args) {
	BlockingQueue<String> queue= new ArrayBlockingQueue<String>(3);
	InterviewScheduler producer= new InterviewScheduler(queue);
	InterviewProcessor consumer= new InterviewProcessor(queue);
	new Thread(producer).start();
	new Thread(consumer).start();
}
}
class InterviewScheduler implements Runnable{
	private BlockingQueue<String> queue;
	public InterviewScheduler(BlockingQueue<String> q) {
		this.queue =q;
	}
	@Override
	public void run() {
		System.out.println("10 people arrived");
		for(int i=1;i<=10;i++) {
			String msg=new String("candidate "+i);
			try {
				queue.put(msg);
				System.out.println("InterviewScheduler for"+msg);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Interviews scheduled for all people");
		String msg=new String("Stop");
		try {
			queue.put(msg);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
class InterviewProcessor implements Runnable{
	private BlockingQueue<String> queue;
	public InterviewProcessor(BlockingQueue<String> q) {
		this.queue =q;
	}
	@Override
	public void run() {
		try {
			String msg;
			Thread.sleep(1000);
			while(!(msg=queue.take()).equals("stop")) {
				System.out.println("interview completed for"+msg);
				Thread.sleep(1000);
			}
			System.out.println("Interview completed for all candidates");
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
}