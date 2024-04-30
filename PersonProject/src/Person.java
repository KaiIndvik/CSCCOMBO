
public class Person {
	
	//Data Members
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String fName, String lName, int age) {
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}
	
	public void changeFirstName(String fName) {
		this.firstName = fName;
	}
	
	public String firstNameGetter() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String stringifyer() {
		return firstName + lastName + age + firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
	
	
}
