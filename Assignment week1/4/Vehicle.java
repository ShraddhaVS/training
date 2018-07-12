

import java.util.Scanner;

public class Vehicle {
	protected String name;
	protected String owner;
	protected String model;
	protected int sno;
	static int len = 0;

	
	public Vehicle() {
		sno = len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,owner, model");
		name = sc.nextLine();
		owner = sc.nextLine();
		model = sc.nextLine();
	}

	public void find() {
		System.out.println("Sno: " + sno);
		System.out.println("Name: " + name);
		System.out.println("Owner: " + owner);
		System.out.println("Model: " + model);

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
		default:
			break;
		}
	}


	public void delete() {
		name = null;
		owner = null;
		model = null;
		len--;
		System.out.println("deleted");
	}

}
