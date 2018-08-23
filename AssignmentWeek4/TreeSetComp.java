package week4;

import java.time.LocalDate;
import java.time.Month;
import java.util.TreeSet;

class Car implements Comparable<Car>{
	public String model;	
	public String owner;
	public String registerCity;
	public LocalDate serviceDate;

	public Car(String model,String owner, String registerCity, LocalDate serviceDate) {
		this.model = model;
		this.serviceDate = serviceDate;
		this.owner = owner;
		this.registerCity = registerCity;
	}

	public String toString() {
		 return String.format("\n[Model:%s,Owner:%s,registeredCity:%s,ServiceDate:%s]", 
				 model,owner,registerCity,serviceDate.toString());
	 }

	@Override
	public int compareTo(Car car) {
		return this.model.compareTo(car.model);
	}
}

public class TreeSetComp {

	public static void main(String[] args) {
		TreeSet<Car> carList = new TreeSet<Car>();
		carList.add(new Car("S-Class", "Guzan", "NewYork", LocalDate.of(2014, Month.AUGUST, 01)));
		carList.add(new Car("C-Class", "Bedoya", "California", LocalDate.of(2009, Month.DECEMBER, 05)));
		carList.add(new Car("A-Class", "Cameron", "Illinois", LocalDate.of(2014, Month.JULY, 25)));
		carList.add(new Car("SL-Class", "Johnson", "Kansas" ,LocalDate.of(2011, Month.DECEMBER, 10)));
		System.out.println("Sorted car objects by Model:\n"+ carList);				
	}
}
