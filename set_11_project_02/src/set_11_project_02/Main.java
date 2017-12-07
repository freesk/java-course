package set_11_project_02;

import java.util.*;
import set_11_project_02.*;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> person_list = new ArrayList<Person>();
		
		Car car;
		Person person;
		String name;
		
		// That's quite expensive
		final int MAX_PRICE = 80000;
		// How many people we want to create
		final int NUMBER_OF_PEOPLE = 100;
		
		String[] makers = {
				"Toyota",
				"Honda",
				"Ford",
				"Opel",
				"BMW",
				"Subaru",
				"Audi"
		};
		
		for(int i = 0; i < NUMBER_OF_PEOPLE; i++) {
			// Create a new car with a random maker and a random price
			car = new Car(makers[getRandomInt(0, makers.length)], getRandomInt(2000, 100000));
			// Get a random name for the person 
			name = NameGenerator.generateName();
			// Crate a new person
			person = new Person(name, car);
			// Add to the array
			person_list.add(person);
		}
		
		// Get all cars that belong to the people in the array
		ArrayList<Car> all_cars_list = Person.getCars(person_list);
		// Get only those cars that cost more than MAX_PRICE
		ArrayList<Car> all_expensive_cars_list = Person.expensiveCars(person_list, MAX_PRICE);
		
		// Print it all out 
		
		for(Person p: person_list) {
			System.out.println(p.getName() + " has " + p.getCar().getMake());
		}
		
		System.out.println("");
		
		for(Car c: all_cars_list) {
			System.out.println(c.getMake() + " $" +  c.getPrice());
		}
		
		System.out.println("");
		
		// Sort in ascending order
		Collections.sort(all_expensive_cars_list, new Comparator<Car>() {
			@Override
			public int compare(Car c1, Car c2) {
				return c1.getPrice() - c2.getPrice();
			}
		});
		
		for(Car c: all_expensive_cars_list) {
			System.out.println(c.getMake() + " $" +  c.getPrice());
		}
		
		System.out.println("");
		
		// Sort in descending order
		Collections.sort(all_expensive_cars_list, new Comparator<Car>() {
			@Override
			public int compare(Car c1, Car c2) {
				return c2.getPrice() - c1.getPrice();
			}
		});
		
		for(Car c: all_expensive_cars_list) {
			System.out.println(c.getMake() + " $" +  c.getPrice());
		}
		
		System.out.println("");
		System.out.println("There are " + all_expensive_cars_list.size() + " cars that cost more or equal to $" + MAX_PRICE);
	}
	
	// Get an int between min and max
	public static int getRandomInt(int min, int max) {
		return min + (int)(Math.random() * max); 
	}
	

}
