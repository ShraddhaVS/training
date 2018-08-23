package assignment;

import java.util.Scanner;

class UniqueNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[200];
		int b[] = new int[100];
		System.out.println("enter nos from 1 t 100");
		for (int i = 0; i < 5; i++) {
			a[i]=sc.nextInt();
		}
		b[0]=a[0];
		int j=0;
		for (int i = 1; i < a.length; i++) {
			if(b[j]!=a[i]) {
				b[++j]=a[i];
			}
				
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}
	}
}
