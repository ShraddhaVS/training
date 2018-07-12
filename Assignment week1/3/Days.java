


enum Day {
	MON(1),TUE(2),WED(3),THUR(4),FRI(5),SAT(6),SUN(7);
	 private int numVal;

    Day(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}

public class Days {

	public static void main(String[] args) {
		Day[] words=Day.values();
		
		for(Day word:words)
		{
		System.out.println("Name : " + word.name() +" Value: " + word.getNumVal() );
		}
		
	}
	}