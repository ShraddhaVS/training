package week3;

public class FormatExample {
	public static void main(String[] args) {
		String result = String.format("One: %1$d Two: %2$d Three: %3$d", 10, 20, 30);
		System.out.println(result);

		for (int i = 0; i < 5; i++) {
			result = String.format("%1$05d %2$05d", i, i + 10);
			System.out.println(result);
		}

		double number = 1.23456;
		String value = String.format("Three numbers after decimal: %1$.3f", number);
		System.out.println(value);
		
		String id = "ART1";
		int number1 = 100;

         value = String.format("%2$d %1$s", id, number1);
        System.out.println(value);
        
        System.out.printf("My name is: %s%n", "joe");
        System.out.format("My name is: %s", "joe");


	}
}
