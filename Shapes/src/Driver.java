
public class Driver {

	public static void main(String[] args) {
	
		//Create a rectangle object
		// Write a calculator that determines the area and perimeter of the rectangle object. 
		
		Rectangle shape1 = new Rectangle();
		
		shape1.setLength(5);
		
		int w = 5;
		int l = 3;
		Rectangle shape2 = new Rectangle(l, w);
//		Rectangle shape4 = new Rectangle ( 5, 3);
//		
//		Rectangle shape3 = new Rectangle (10,15,"Ricky");
//		
//		shape1.setLength(7);
		
		System.out.println(areaCalc(shape2));
		
		
		System.out.println(Calculator.areaCalculator(shape2));
		
	

	}
	
	public static int areaCalc(Rectangle shape) {
		
		return shape.getLength() * shape.getWidth();
		
	}

}
