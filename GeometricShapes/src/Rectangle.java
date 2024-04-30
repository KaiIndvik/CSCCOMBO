
public class Rectangle extends Shape{
	
	private int width;
	private int length;
	
	
	public Rectangle(String color, int width, int length) {
		super(color);
		this.width = width;
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public double calculateArea() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	

}
