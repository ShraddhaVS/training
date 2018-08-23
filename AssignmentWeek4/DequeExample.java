package week4;

import java.util.*;

public class DequeExample
{
 public static void main(String[] args)
 {
     Deque<String> deque = new LinkedList<String>();

   
     deque.add("Element 1 (Tail)");
     deque.addFirst("Element 2 (Head)");
     deque.addLast("Element 3 (Tail)");
     deque.push("Element 4 (Head)");
     deque.offer("Element 5 (Tail)");
     deque.offerFirst("Element 6 (Head)");
     deque.offerLast("Element 7 (Tail)");

     System.out.println(deque + "\n");

     System.out.println("Standard Iterator");
     Iterator iterator = deque.iterator();
     while (iterator.hasNext())
         System.out.println("\t" + iterator.next());

     Iterator reverse = deque.descendingIterator();
     System.out.println("Reverse Iterator");
     while (reverse.hasNext())
         System.out.println("\t" + reverse.next());
   
     System.out.println("Peek " + deque.peek());
     System.out.println("After peek: " + deque);

     System.out.println("Pop " + deque.pop());
     System.out.println("After pop: " + deque);
     System.out.println("Contains element 3: " +
                     deque.contains("Element 3 (Tail)"));

     deque.removeFirst();
     deque.removeLast();
     System.out.println("Deque after removing " +
                         "first and last: " + deque);

 }
}