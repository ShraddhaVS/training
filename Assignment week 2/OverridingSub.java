package assignment;

public class OverridingSub extends OverridingSuper {
	public void display(int i){
	super.display(i);
	System.out.println("Subclass"+i);
	}
	
	 static void show() {
	        System.out.println("Static in sub");
	    }
	 
	public static void main(String[] args){
	OverridingSuper b1=new OverridingSub();

	b1.display(1);
	show();
	}
}
