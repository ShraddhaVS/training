

import java.util.Scanner;

public class Truck extends Vehicle implements servicetime {

	String load;
	int nextser;
	
	public Truck() {
		super();
		System.out.println("Enter Load");
		Scanner sc = new Scanner(System.in);
		load = sc.nextLine();
		System.out.println("Enter Last service time");
		int y = sc.nextInt();
		nextser=nextservice(y);
		
	}
	public int nextservice(int y)
	{
		return y+5;
	}

	public void find() {
		super.find();
		System.out.println("Load : " + load);
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
		case "load":
			load = s1;
		default:
			break;
		}
	}

	public void delete()
	{
	super.delete();
	load=null;
	nextser=0;
	}

	
	}
