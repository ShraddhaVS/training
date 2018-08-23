package assignment;

public class EqualsOverriding {

	public String a,b;

	public EqualsOverriding(String a, String b) {
		this.a = a;
		this.b = b;
	}
	public boolean equals(EqualsOverriding o) {

		if (o == this) {
			return true;
		}

		if (!(o instanceof EqualsOverriding)) {
			return false;
		}

	

		if(this.a==o.a && this.b==o.b) {
			return true;
			}
		else 
			return false;
	}
	

	public static void main(String[] args) {
		EqualsOverriding c1 = new EqualsOverriding("a", "b");
		EqualsOverriding c2 = new EqualsOverriding("a", "b");
		if (c1.equals(c2)) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}
	}
}
