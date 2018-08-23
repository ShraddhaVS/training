package week4;
import java.util.*;  

public class PriorityQueueExample {
	
	 
	public static void main(String args[]){  
		PriorityQueue<String> queue=new PriorityQueue<>();  
	queue.add("first");  
	queue.offer("second");  
	queue.add("third");  
	queue.offer("fourth");  
	  
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("iterating the queue elements:");  
	 
	System.out.println(queue);  
	
	System.out.println(queue.remove());  
	System.out.println(queue.poll());  
	System.out.println("after removing two elements:");  
	
	System.out.println(queue);  
	 
	  
	}  
}
