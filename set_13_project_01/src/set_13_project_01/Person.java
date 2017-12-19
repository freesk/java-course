package set_13_project_01;

public class Person {
	
	private String name; 
	private Car cars;
	
	public Person(String name) { 
		this.name = name;
	}
	public Person buys(String make, int price) { 
		cars = new Car(make, price, cars);  
		return this;
	}
	public String getName() { 
		return name;
	}
	public void showCars() { 
		cars.showCars();
	}
	public void showCarsRev() { 
		 cars.showCarsRev();
	}
	public int getTotalPrice() { 	
		Car current = cars;
		int total = 0;
		while(current != null) {
			total += current.getPrice();
			current = current.getNext();
		}
		return total;
	}
	public boolean hasCar(String make) { 
		Car current = cars;
		boolean foo = false;
		while(current != null) {
			foo = make.equals(current.getMake()) ? true : false;
			current = current.getNext();
		}
		return foo;	 
	}
	public String mostExpensive() { 
		Car current = cars;
		Car top = current;
		while(current != null) {
			if(top.getPrice() < current.getPrice()) 
				top = current;
			current = current.getNext();
		}
		return top.getMake(); 
	}

}
