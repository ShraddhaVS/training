package week3;

import java.io.*;

public class FileExample {
	public static void main(String[] args) throws IOException {
		String line;
		File f = new File("File5.txt");
		//if (f.createNewFile()) {
			FileWriter fw = new FileWriter("File5.txt");
			fw.write("Good Morning");
			fw.close();

			FileReader fr = new FileReader("File5.txt");
			BufferedReader bufferedReader = new BufferedReader(fr);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			
			//}
		}
	}
}