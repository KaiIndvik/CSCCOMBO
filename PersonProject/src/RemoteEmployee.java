
public class RemoteEmployee extends Employee {
	String email;
	
	public RemoteEmployee() {
		
	}
	
	public RemoteEmployee(String firstName, String lastName, int age, int ID, String email) {
		super(firstName, lastName, age, ID);
		this.email = email;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return sg
	}
	
	
}
