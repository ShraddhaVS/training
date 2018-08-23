package assignment;

public class ReverseString {
	public static void main(String[] args) {
	String a="Helloo";
	System.out.println(a.toCharArray());
	char arr[]=a.toCharArray();
	
	int len=arr.length;
	int j=len;
	for(int i=0;i<len/2;i++) {
		char temp = arr[--j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}
	System.out.println(String.copyValueOf(arr));
	
}
}
