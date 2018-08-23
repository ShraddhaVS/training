

import java.util.Scanner;

public class Application extends Vehicle{

	public static void main(String[] args) {
		Vehicle[] a = new Vehicle[10];
		
		String n=new String();
		int f = 1;
		while (f == 1) {
			System.out.println("Enter 1 for add \n 2 for del \n 3 for update \n 4 for finding\n 5 for listing\n");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			switch (s) {
			case 1:
				System.out.println("enter type of vehicle:car, truck,cycle");
				sc.nextLine();
				n = sc.nextLine();
				switch (n)
				{
				case "car":
					a[++len] = new Car();break;
				case "truck":
					a[++len] = new Truck();	break;
				case "cycle":
					a[++len] = new Cycle();	break;
				default: break;
				}
				break;
			case 2:
				if (len > 0) {
					System.out.println("Enter Sno");
					int sno = sc.nextInt();
					a[sno].delete();
				} else
					System.out.println("No element to delete");
				break;
			case 3:
				if (len > 0) {
					System.out.println("Enter Sno");
					int sno = sc.nextInt();
					a[sno].update();
				} else
					System.out.println("No element to update");
				break;

			case 4:
				if (len > 0) {
					System.out.println("Enter Sno");
					int sno = sc.nextInt();
					a[sno].find();
				} else
					System.out.println("No element to display");
				break;
			case 5:
				if (len > 0) {
					for (int i = 1; i <= len; i++) {
						a[i].find();
						System.out.println("\n");
					}
				} else
					System.out.println("No element to list");
				break;
			default:
				break;
			}
			System.out.println("to continue press 1 else 0");
			f = sc.nextInt();
			
		}
	}

}