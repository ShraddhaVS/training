package assignment;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter nos");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int len = a.length;
		int j = len;

		for (int i = 0; i < len / 2; i++) {

			int temp = a[--j];
			a[j] = a[i];
			a[i] = temp;

		}
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}
	}

}
