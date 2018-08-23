package week3;

public class ParseExample {
	public static void main(String[] args) {

		int decimalExample = Integer.parseInt("20");
		int signedPositiveExample = Integer.parseInt("+20");
		int signedNegativeExample = Integer.parseInt("-20");
		int radixExample = Integer.parseInt("20", 16);
		int octaExample = Integer.parseInt("20", 8);

		Long longExample = Long.parseLong("10");
		Double doubleExample = Double.parseDouble("5");

		System.out.println(decimalExample);
		System.out.println(signedPositiveExample);
		System.out.println(signedNegativeExample);
		System.out.println(radixExample);
		System.out.println(octaExample);
		System.out.println(longExample);
		System.out.println(doubleExample);
	}
}