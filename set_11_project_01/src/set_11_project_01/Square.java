package set_11_project_01;

import java.util.ArrayList;

import set_11_project_01.Circle;

public class Square {
	
	private double width = 0;
	
	public Square(double width) {
		this.width = width;
	}
	
	public Square(Circle c) {
		double c_area = c.getArea();
		this.width = Math.sqrt(c_area);
	}
	
	public double getSide() {
		return width;
	}
	
	public Circle getInscribedCircle() {
		Circle c = new Circle(width/2);
		return c;
	}
	
	public Circle getCircumscribedCircle() {
		Circle c = new Circle(getDiagonal()/2);	
		return c;
	}
	
	public double getArea() {
		return width * width;
	}
	
	public double getDiagonal() {
		return Math.sqrt( (width * width) + (width * width) ); 
	}

	public double getPerimeter() {
		return width + width + width + width;
	}
	
	public static ArrayList<Circle> getCircles(ArrayList<Square> list) {
		ArrayList<Circle> foo = new ArrayList<Circle>();
		Circle c;
		for(Square s: list) {
			c = new Circle(s);
			foo.add(c);
		}
		return foo;
	}
	
	@Override
	public String toString() {
		return "Square[" + width + "]";
	}
	
}
