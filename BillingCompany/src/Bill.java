import java.util.ArrayList;

public class Bill {
	
	private double total;
	private ArrayList<Item> items = new ArrayList<>();
	
	public Bill(double total, ArrayList<Item> items) {
		super();
		this.total = total;
		this.items = items;
	}
	
	

}
