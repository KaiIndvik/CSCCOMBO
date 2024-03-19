
public class SalesPerson {
	
	private String name;
	private static int IDCounter = 1; //this is a static int, that stays with the class. It gets iterated every time the SalesPerson constructor gets called. 
	private  int ID = 1; // this is the ID variable that gets assigned to and stays with the object that is created by the constructor. 
	private double sales;

	
	// Constructor
	public SalesPerson(String name, double sales) {
		this.name = name;
		this.sales = sales;
		this.ID = IDCounter;
		IDCounter++;
		
	}
	
	// Getters and Setters/Accessors and Mutators
	
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
	
	
	//To String
	
	@Override
	public String toString() {
		return "Salesperson Name: " + name + "ID number: " + ID + " Sales: $" + sales;
	}
	
	
	
	

}
