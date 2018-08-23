package assignment;

public class StringMethods {
	public static void main(String[] args) {
	String a="Hello";
	
	System.out.println(a.charAt(1));
	System.out.println(a.codePointAt(1));
	System.out.println(a.codePointBefore(1));
	System.out.println(a.codePointCount(0, 2));
	String b=a;
	a="b";
	System.out.println(a.compareTo("a"));
	b="hello";
	System.out.println(a.compareTo(b));
	System.out.println(a.compareToIgnoreCase(b));
	System.out.println(a.concat(b));
	System.out.println(a.contains("He"));
	a="Heleleo";
	System.out.println(a.contentEquals(b));
	String arr[]=a.split("e");
	for(int i=0;i<4;i++)
	System.out.println(arr[i]);
	a="Hello";
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(b));
	System.out.println(a.startsWith("H"));
	System.out.println(a.endsWith("H"));
	System.out.println(a.indexOf("l"));
	System.out.println(a.lastIndexOf("l"));
	System.out.println(a.charAt(1));
	System.out.println(a.substring(1));
	System.out.println(a.substring(1,3));
	System.out.println(a.toLowerCase());
	System.out.println(a.toUpperCase());
	String c="       Good morning     ";
	System.out.println(c.trim());
	System.out.println(a.replace("l","p"));
	System.out.println(a.valueOf(c));
	System.out.println(a.matches("Hello"));
	System.out.println(a.replaceAll(c,a));
	String e=new String("Bye");
	System.out.println(e.intern());
}
}