package assignment;

public class OverridingSuper extends AbstractClass {
	protected void display(int i) {
	System.out.println("Superclass"+i);
	}
	 static void show() {
	        System.out.println("Static in super");
	    }
	
	public static void main(String[] args){
	OverridingSuper b1=new OverridingSuper();
	b1.display(1);
	show();
	}
}
