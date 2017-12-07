package set_11_project_02;

public class Car {
	
	private String make;
	private int price;
	
	public Car(String make, int price) {
		this.price = price;
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
