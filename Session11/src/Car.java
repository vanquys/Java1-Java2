
public class Car {
	String color;
	int mileage;
	String make;
	public Car(String color, int mileage, String make) {
		this.color = color;
		this.mileage = mileage;
		this.make = make;
	}
	
		@Override
		public String toString() {
			return color + " "+ mileage+" " +make;
		}
}
