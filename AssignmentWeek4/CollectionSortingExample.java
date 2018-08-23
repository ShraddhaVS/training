package week4;

import java.util.*;

public class CollectionSortingExample {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("b");
		al.add("c");
		al.add("a");
		al.add("e");
		al.add("d");

		Collections.sort(al);
		System.out.println("List after the use of" + " Collection.sort() :\n" + al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("List in reverse order after the use of" + " Collection.sort() :\n" + al);
	}
}
