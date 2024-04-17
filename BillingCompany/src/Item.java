
public class Item {
	
	private String description;
	private double cost;
	
	public Item(String description, double cost) {
		super();
		this.description = description;
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [description=" + description + ", cost=" + cost + "]";
	}
	
	
}
