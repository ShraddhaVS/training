package week4;

import week4.OuterClass1.InnerClass;

class OuterClas {
	static int outer_x = 10;

	int outer_y = 20;

	private int outer_private = 30;

	void display() {
		class InnerClass {
			void show() {

				System.out.println("outer_x = " + outer_x);
				System.out.println("outer_y = " + outer_y);
				System.out.println("outer_private = " + outer_private);
			}
		}

		InnerClass innerObject = new InnerClass();
		innerObject.show();

	}
}

public class InsideMethods {
	public static void main(String[] args) {
		OuterClass1 outerObject = new OuterClass1();
		OuterClass1.InnerClass innerObject = outerObject.new InnerClass();

		innerObject.display();

	}
}
