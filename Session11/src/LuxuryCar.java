
public class LuxuryCar extends Car {
	String perks;
	public LuxuryCar(String color, int mileage, String make, String perks) {
		super(color, mileage, make);
		this.perks = perks;
	}
	@Override
	public String toString() {
		return color + " "+ mileage+" " +make +" "+perks;

	}
	
}
