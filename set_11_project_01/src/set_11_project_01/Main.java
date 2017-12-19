package set_11_project_01;

import java.util.*;

import set_11_project_01.Square;
import set_11_project_01.Circle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Square> sqs = new ArrayList<Square>();
		
		sqs.add(new Square(2));
		sqs.add(new Square(1));
		sqs.add(new Square(3));
		sqs.add(new Square(2));
		
		for(Square s:sqs)
				System.out.print(s + " ");
		
		System.out.print("\nAreas: ");
		
		for(Square s:sqs)
				System.out.print(s.getArea()+" ");
		
		System.out.print("\nPerimeters: ");
				
		for(Square s:sqs)
				System.out.print(s.getPerimeter()+" ");
		
		ArrayList<Circle> crs = new ArrayList<Circle>();
		
		crs.add(new Circle(2));
		crs.add(new Circle(1));
		crs.add(new Circle(3));
		crs.add(new Circle(2));
		
		System.out.println("");
		
		for(Circle c:crs)
			System.out.print(c + " ");
		
		ArrayList<Square> squares = Circle.getSquares(crs);
		
		System.out.println("\nPerimeters of squares from circles: ");
		
		for(Square s:squares)
			System.out.printf("%.2f ", s.getArea());
		
		System.out.println();
	}

}
