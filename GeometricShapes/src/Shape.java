
public class Shape {

	private String color;
	private String name;

	public Shape() {
		
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	public Shape(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Area Calculator
	public double calculateArea() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	
	
}
