
public class SalesPerson {
	String name;
	double sales;
	int ID;
		
	public SalesPerson() {
		
	}

	public SalesPerson(String name, double sales, int iD) {
		this.name = name;
		this.sales = sales;
		ID = iD;
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}


