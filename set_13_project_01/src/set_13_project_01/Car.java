package set_13_project_01;

public class Car {
	
	private String make;
	private int price;
	private Car next = null;
	
	public Car(String make, int price, Car n) {
		this.price = price;
		this.make = make;
		this.next = n;
	}
	
	public String getMake() { 
		return make; 
	}
	
	public int getPrice() { 
		return price;
	}
	
	public Car getNext() { 
		return next;
	}
	
	public void showCars() { 
		System.out.print(this + " ");
		if(next != null) 
			next.showCars();	
	}
	
	public void showCarsRev() { 
		if(next != null) 
			next.showCarsRev();
		System.out.print(this + " ");	
	}
	
	@Override
	public String toString() { 
		return make + " $" + price; 
	}

}
