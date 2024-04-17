import java.util.ArrayList;

public class Company {
	private String companyName;
	private ArrayList<Customer> customerList = new ArrayList<>();
	
	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void addCustomers(Customer customer) {
		this.customerList = customerList;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", customerList=" + customerList + "]";
	}

	
	
}
