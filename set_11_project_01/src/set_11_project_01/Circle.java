package set_11_project_01;

import static java.lang.Math.PI;
import java.util.*;

import set_11_project_01.Square;

public class Circle {

	private double radius = 0;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(Square s) {
		double s_area = s.getArea();
		this.radius = s_area/2*PI;
	}

	public Square getInscribedSquare() {
		double width = Math.sqrt(((radius*2)*(radius*2))/2);
		Square s = new Square(width);
		return s;
	}

	public Square getCircumscribedSquare() {
		Square s = new Square(radius*2);
		return s;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public static ArrayList<Square> getSquares(ArrayList<Circle> list) {
		ArrayList<Square> foo = new ArrayList<Square>();
		Square s;
		for(Circle c: list) {
			s = new Square(c);
			foo.add(s);
		}
		return foo;
	}

	@Override
	public String toString() {
		return "Circle[" + radius + "]";
	}
}
