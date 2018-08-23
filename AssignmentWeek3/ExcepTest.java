package week3;

public class ExcepTest {

	public static void main(String args[]) {
		int a[] = new int[2];
		try {
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
			throw e;
		}
		finally
		{
			System.out.println("Error");
		}
		System.out.println("Out of the block");

	}
}