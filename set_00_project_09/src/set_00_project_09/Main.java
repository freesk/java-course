package set_00_project_09;

import set_00_project_09.Box;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Integer> integerBox = new Box<Integer>();
		Box<Double> doubleBox = new Box<Double>();
		
		integerBox.set(1001);
		doubleBox.set(0.1001);
		
		System.out.println(integerBox.get());
		System.out.println(doubleBox.get());
		
	}

}
