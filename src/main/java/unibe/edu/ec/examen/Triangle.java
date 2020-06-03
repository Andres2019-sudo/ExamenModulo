package unibe.edu.ec.examen;

public class Triangle {
	private int side;

	public Triangle(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public int calculatePerimeter() {
		int perimeter= side+side+side;
		return perimeter;
	}
}
