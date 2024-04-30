
public class Rectangle {
	
	int length;
	int width;
	String name;
	
	
	public Rectangle() {
		
	}

	
	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
		
	}
	
	public Rectangle(int length, int width, String name) {
		
		this.length = length;
		this.width = width;
		this.name = name;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	

	
}
