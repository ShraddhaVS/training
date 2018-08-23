package assignment;

public class MaxLetters {
	public static void main(String[] args) {
		String a = "sdssdafsdsasaddfsd";
		char arr[] = a.toCharArray();
		int n = arr.length;
		int max = 0;
		int pos = 0;

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		System.out.println("Sorted array: \n");

		System.out.println(String.copyValueOf(arr));
		int c = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				c++;
			} else {
				if (max < c) {

					max = c;
					pos = i;
				}
				c = 0;
			}

		}
		System.out.println(arr[pos]);
	}
}
