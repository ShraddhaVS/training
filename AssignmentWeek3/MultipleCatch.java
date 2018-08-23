package week3;

public class MultipleCatch {
	public static void main(String[] args) {

		int i = 8;
		int j = 0;
		int num[] = { 1, 2, 3, 4 };

		try {
			int k = i / j;
			System.out.println(num[5]);
		} catch (ArithmeticException e) {
			System.out.println(" Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array Index Out Of Bounds Exception");
		} catch (Exception e) {
			System.out.println(" Other Exception");
		}
	}
}
