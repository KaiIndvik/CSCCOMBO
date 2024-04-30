
public class Employee extends Person {
	//Data Members
	private int ID;
	
	//Default (No Arg) Constructor
	public Employee() {
		
	}
	
	//Constructor 
	public Employee(String firstName, String lastName, int age, int ID) { // Must declare ALL arguments this constructor takes
		 super(firstName,lastName,age); // This line calls the super classes constructor, and passes data members to it
		 this.ID = ID;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [ID=" + ID + "]";
	}
	
	

}
