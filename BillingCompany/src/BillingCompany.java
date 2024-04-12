import java.util.ArrayList;
import java.util.Scanner;

public class BillingCompany {

	public static void main(String[] args) {
		
		ArrayList<Company> companyMasterList = new ArrayList<>();
		ArrayList<Company> personMasterList = new ArrayList<>();
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter user type: \n1)Admin \n2)Company \n3)Person");
		int choice = scn.nextInt();
		
		switch(choice){
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
		
	}
	
	public static void CompanyUser() {
		
	}
	
	public static void PersonUser() {
		
	}

}
