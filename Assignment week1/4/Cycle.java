

import java.util.Scanner;

public class Cycle extends Vehicle {

	String pedaltype;

	public Cycle() {
		super();
		System.out.println("Enter Pedal type");
		Scanner sc = new Scanner(System.in);
		pedaltype = sc.nextLine();
		
	}

	public void find() {
		super.find();
		System.out.println("pedal type : " + pedaltype);
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
		case "pedaltype":
			pedaltype = s1;
		default:
			break;
		}
	}
	public void delete()
	{
	super.delete();
	pedaltype=null;
	}
	
	
}