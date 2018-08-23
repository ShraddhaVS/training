package week3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FinallyExample {
	public static void main(String[] args) throws IOException {

		File file = new File("MultipleCatch.java");
		File file1 = new File("D://file.txt");
		FileReader fr = new FileReader(file1);
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println(" File Not Found Exception");
		} catch (Exception e) {
			System.out.println(" Other Exception");
		} finally {
			fr.close();
		}
	}
}