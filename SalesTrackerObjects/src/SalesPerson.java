
public class SalesPerson {
	
	private String name;
	private static int IDCount = 1;
	private int ID;
	private double sales;

	public SalesPerson(String name, double sales) {
		this.name = name;
		this.sales = sales;
		this.ID = IDCount;
		IDCount++;
		
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
	
	

	@Override
	public String toString() {
		return "SalesPerson [name=" + name + "ID number: " + ID + ", sales=" + sales + "]";
	}
	
	
	
	

}
