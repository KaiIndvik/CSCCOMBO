
public class GeometricShapes {

	public static void main(String[] args) {
		
		//Write a shape class
		//Write a rectangle class that extends shape
		//Write a circle class that extends shape
		
		//Write a triangle class that extends shape.
		
		//Both Rectangle and Circle class will have a method that calculates their area.
		
		Rectangle shape1 = new Rectangle("White", 5, 6);
		Circle shape2 = new Circle("Red", 10.5);
		Triangle shape3 = new Triangle("Tracy", "Blue", 1.1,2.2,3.3);
		Triangle shape4 = new Triangle("Tracy2", 2,3,4);
		Triangle shape5 = new Triangle("Red", 3,4,5);
		
		
		System.out.println(shape3.toString());
		System.out.println(shape5.toString());
		System.out.println(shape4.calculateArea());
		
		System.out.println(GeometricShapes.areaCalculator(shape1));
		System.out.println(GeometricShapes.areaCalculator(shape2));

		
		
//		shape2.setCircumference(60);
//		shape2.setRadius(10.5);
//		
//		System.out.println(shape1.calculateArea());
//		System.out.println(shape2.calculateArea());
	}
	
	public static double areaCalculator(Shape obj) {
		return obj.calculateArea();
	}
	
	
}
