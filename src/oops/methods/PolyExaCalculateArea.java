package oops.methods;

public class PolyExaCalculateArea {
	/*
	 * This is a simple program to demonstrate polymorphism
	 * This class will have a method called as calculateArea()
	 * This calculateArea() method will calculate and return area's for different shapes
	 */

	float calculateArea(float area) {
		//Area of square
		return (area*area);
	}
	
	double calculateArea() {
		//Area of circle
		return (3.14*calculateArea(10));
	}
	
	float calculateArea(float height,float width) {
		//Area of rectangle
		return (height*width);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyExaCalculateArea ar = new PolyExaCalculateArea();
		System.out.println("Area of circle		- 	"+ar.calculateArea());
		System.out.println("Area of square		-	"+ar.calculateArea(5));
		System.out.println("Area of rectangle	-	"+ar.calculateArea(10.5f, 20.0f));
	}

}
