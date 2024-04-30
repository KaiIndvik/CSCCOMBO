import java.util.ArrayList;
import java.util.Scanner;

public class BillingCompany {

	public static void main(String[] args) {

		ArrayList<Company> companyMasterList = new ArrayList<>();
		ArrayList<Person> personMasterList = new ArrayList<>();
		
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter user type: \n1)Admin \n2)Company \n3)Person");
		int choice = scn.nextInt();

		switch (choice) {
		case 1:
			AdminUser();
			break;
		case 2:
			CompanyUser();
			break;
		case 3:
			PersonUser();
			break;
		}

	}

	public static void AdminUser() {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) Add Company");
		System.out.println("2) View Company List");
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Please enter the Company Name:");
			String name = scn.next();
			
			
		case 2:
			
		}
	}

	public static void CompanyUser() {

	}

	public static void PersonUser() {

	}

}
