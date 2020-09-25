package object.manipulation;

import java.util.Scanner;

public class Rectangle {
	private float length;
	private float breadth;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public float getLength() {
		return this.length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return this.breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public float getArea() {
		return getLength()*getBreadth();
	}

	public float getPerimeter() {
		return 2*(getLength()+getBreadth());
	}

	public boolean isAreaEqual(Rectangle r1, Rectangle r2) {
		if(r1.getArea() == r2.getArea())
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length and breadth: ");
		float l= sc.nextFloat();
		float b=sc.nextFloat();
		Rectangle rec=new Rectangle(l,b);
		sc.close();
		System.out.println("Area: "+rec.getArea());
		System.out.println("Perimeter: "+rec.getPerimeter());
	}
}
