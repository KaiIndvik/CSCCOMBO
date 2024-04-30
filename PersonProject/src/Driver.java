
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person1 = new Person("John", "Doe", 157);
//		
//		person1.changeFirstName("Jim");
//		System.out.println(person1.stringifyer());
//		System.out.println(person1.firstNameGetter());
//		
//		Employee employee1 = new Employee("Bob", "Jones", 9, 15);
		RemoteEmployee remoteEmployee1 = new RemoteEmployee("Bob", "Jones", 50, 2, "email@example.com");
		System.out.println(remoteEmployee1.toString());
		
		System.out.println(remoteEmployee1);
		
		
		
	}
	
	
	
	

}
