package assignment;

public class SortString {

	
	public static void main(String[] args)
	{
		String a="zxcvb";
	    char arr[] = a.toCharArray();
	    int n = arr.length;
	    
	    
		   for (int i = 0; i < n-1; i++)     
		       for (int j = 0; j < n-i-1; j++) 
		           if (arr[j] > arr[j+1]) {
		        	   char temp = arr[j];
		   	    arr[j] = arr[j+1];
		   	    arr[j+1] = temp;
		           }
		   	 System.out.println("Sorted array: \n");
	    
	    System.out.println(a.copyValueOf(arr));
	   
	    
	}
}
