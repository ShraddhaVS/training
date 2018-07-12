

import java.util.Scanner;

public class Car extends Vehicle {

	String noofwiper;
	int nextser;

	
	public Car() {
		super();
		System.out.println("Enter no of wiper");
		Scanner sc = new Scanner(System.in);
		noofwiper = sc.nextLine();
		System.out.println("Enter Last service time");
		int y = sc.nextInt();
		nextser=nextservice(y);
		
	}
	public int nextservice(int y)
	{
		return y+3;
	}
	public void find() {
		super.find();
		System.out.println("No of wiper: " + noofwiper);
		System.out.println("Next service time: "+nextser);
	}

	public void update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which field do you want to update");
		String s = sc.nextLine();
		System.out.println("enter new " + s);
		String s1 = sc.nextLine();
		
		switch (s) {
		case "name":
			name = s1;
			break;
		case "owner":
			owner = s1;
			break;
		case "model":
			model = s1;
			break;
		case "no of wiper":
			noofwiper = s1;
		default:
			break;
		
		}
	}
	
	public void delete()
	{
	super.delete();
	noofwiper=null;
	nextser=0;
	}

	
}