package assignment;

public class FirstNonRepeat {
	public static void main(String[] args)
	{
		String a="hello";
	    char arr[] = a.toCharArray();
	    int n = arr.length;
	    char letter=arr[0];
	    
		   for (int i = 1; i < n-1; i++)  {
			  if(letter!=arr[i]) continue;
			  letter=arr[++i];
		   }
		System.out.println(letter);
	}
}
