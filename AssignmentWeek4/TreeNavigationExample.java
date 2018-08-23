package week4;

import java.util.TreeSet;

public class TreeNavigationExample {
	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);

		TreeSet<Integer> subset = new TreeSet<>();
		subset = (TreeSet<Integer>) times.headSet(1600);
		System.out.println("last before 1600 is: " + subset.last());

		TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet<Integer>) times.tailSet(2000);
		System.out.println("first after 2000 is: " + sub2.first());

		System.out.println("first after 1600 is: " + times.ceiling(1600));
		System.out.println("Descending order " + times.descendingSet());
		System.out.println("remove 1st " + times.pollFirst());
		System.out.println("remove last " + times.pollLast());
		System.out.println("Descending order " + times.descendingSet());
		System.out.println("subset " + times.subSet(1505, true, 1830, true));
		System.out.println("tailset " + times.tailSet(1545));
		System.out.println("headset " + times.headSet(1600));
	}
}
