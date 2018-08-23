package week4;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1> {
	int rollno;
	String name, address;

	public Student1(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}

	@Override
	public int compareTo(Student1 o) {
		if( this.rollno > o.rollno) return 1;
		else if(this.rollno< o.rollno) return -1;
		else return 0;
		
	}
}
public class ComparabaleExample {
	public static void main(String[] args) {
		ArrayList<Student1> ar = new ArrayList<Student1>();
		ar.add(new Student1(111, "bbbb", "london"));
		ar.add(new Student1(131, "aaaa", "nyc"));
		ar.add(new Student1(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar);

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

	}
}
