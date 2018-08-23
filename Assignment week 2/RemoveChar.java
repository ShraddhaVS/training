package assignment;

public class RemoveChar {
	public static void main(String[] args) {
		String str1 = "india is great";
		String str2 = "in";
		char arr[] = str1.toCharArray();
		int n1;
		int n2 = str2.length();
		String s[];
		for (int i = 0; i <n2; i++) {
		
			char st[] = { arr[i] };
			s = str1.split(str1.copyValueOf(st));
			str1="";
			n1 = s.length;
			for (int j = 0; j < n1; j++) {
				
				str1+= s[j];
				
			}
			
		}
		System.out.println(str1);
	}

}
