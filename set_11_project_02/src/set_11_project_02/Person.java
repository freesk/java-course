package set_11_project_02;

import java.util.*;

import set_11_project_02.Car;

public class Person {
	
	private String name;
	private Car car;
	
	public Person(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	
	public Car getCar() {
		return car;
	}
	
	@Override
	public String toString() { 
		return "";
	}
	
	public static ArrayList<Car> getCars(ArrayList<Person> person_list) {
		ArrayList<Car> car_list = new ArrayList<Car>();
		
		for(Person p : person_list)
			car_list.add(p.getCar());
		
		return car_list;
	}
	
	public static ArrayList<Car> expensiveCars(ArrayList<Person> person_list, int min_price) {
		ArrayList<Car> car_list = new ArrayList<Car>();
		
		Car car;
		
		for(Person p : person_list) {
			car = p.getCar();
			if(car.getPrice() >= min_price)
				car_list.add(p.getCar());

		}
		
		return car_list;
	}
	
}
