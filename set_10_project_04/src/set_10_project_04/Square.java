package set_10_project_04;

public class Square {

	private double _width = 0;
	
	public Square(double _width) {
		this._width = _width;
	}
	
	// returning the length of the side of the square;
	public double getSide() {
		return _width;
	}
	// returning the area of the square;
	public double getArea() {
		return _width * _width;
	}
	// returning the length of the diagonal
	public double getDiagonal() {
		return Math.sqrt( (_width * _width) + (_width * _width) ); 
	}
	// returning the length of the perimeter of the square
	public double getPerimeter() {
		return _width + _width + _width + _width;
	}
	
	

}
