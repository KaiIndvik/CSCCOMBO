
public class Circle extends Shape{
	
	private double circumference;
	private double radius;
	
	public Circle(String color) {
		super();
	}
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		this.circumference = 2 * (Math.PI) * radius;
		
	}
	
	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
		this.radius = circumference / (2 * Math.PI);
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
		this.circumference = 2 * (Math.PI) * radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * (this.radius * this.radius);
	}


	@Override
	public String toString() {
		return "Circle [circumference=" + circumference + ", radius=" + radius + "]";
	}
	
}
