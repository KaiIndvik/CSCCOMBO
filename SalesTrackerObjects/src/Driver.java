import java.util.Scanner;







//******************************************************************
//		In this project, we are going to be creating a sales tracking program.
//		It will allow the user to specify a number of salespeople, and it will create an array of SalesPerson objects.
//		These objects will contain a String for a name, a double for a sales amount, and an int ID number that will iterate each time a new SalesPerson object is created. 
//		
//		We will also write three methods: 
//		One that looks through the array, and returns the salesperson with the most sales.
//		One that looks through the array, and returns the salesperson with the lowest sales.
//		One that looks through the array, and returns a new array of salespersons whos Sales are greater than or equal to a value that the user inputs. 
public class Driver {
	public static void main(String[] args) {
		// Creates Scanner
		Scanner scn = new Scanner(System.in);

		// Asks user for how many salespeople there are
		System.out.println("How many salespeople would you like to enter information for?");
		int numSalesPeople = scn.nextInt();
		SalesPerson[] salesPeople = new SalesPerson[numSalesPeople]; // creates an array of salespeople at the correct length
																		 

		// Uses a loop to ask for salesperson's name and sales, for each object in the array.
		for (int i = 0; i < salesPeople.length; i++) {
			System.out.println("What is the sales person's name?");
			String name = scn.next();
			System.out.println("Enter the amount of sales: ");
			double sales = scn.nextDouble();
			salesPeople[i] = new SalesPerson(name, sales);// passes the information gathered from scanner to the SalesPerson constructor
															
		}

		// uses an enhanced for loop to iterate through the array of salespeople, calls each object's toString and prints it.
		System.out.println("Here is the summary of the salespeople in the array:");
		for (SalesPerson person : salesPeople) {
			System.out.println(person.toString());
		}

		// Uses our maxSales method to find the object with the most Sales in the array
		System.out.println("The salesperson with the most sales is " + maxSales(salesPeople).getName() + ", ID# "
				+ maxSales(salesPeople).getID() + " with " + maxSales(salesPeople).getSales() + " in total sales.");
		

		// Same thing, but with least amount of  sales. 
		System.out.println("The salesperson with the least sales is " + minSales(salesPeople).getName() + ", ID# "
				+ minSales(salesPeople).getID() + " with " + minSales(salesPeople).getSales() + " in total sales.");
		
		
		//Calls our metThreshold method, to find the number of salespeople with an amount of sales over a certain value. 
		System.out.println("Enter a threshold sales amount, and I will return an array of the salespeople that exceeded this amount. ");
		double threshold = scn.nextDouble();
		
		SalesPerson[] metThreshold = thresholdSales(salesPeople, threshold); // I made a new array called metThreshold, assigned it by calling our thresholdSales method
		System.out.println("These salespeople met the sales threshold amount you specified:");
		for(int i = 0; i < metThreshold.length; i ++) {
			if(metThreshold[i] != null){ //we have to check if our returned array has any null elements
			System.out.println(metThreshold[i].toString());
			}
		}
	}
	
	
	
	
	

	// maxSales returns the SalesPerson object which contains the highest Sales value. We want to pass this method our whole array of salespeople, so we can look through the whole thing.
	// I changed the name of the array in this method from salesPeople to salesPeopleArray, just to be tricky and make it clear that the variable names in a method call and method header don't need to match.
	public static SalesPerson maxSales(SalesPerson[] salesPeopleArray) {
		SalesPerson mostSales = salesPeopleArray[0]; // Assigns the first SalesPerson to a temp variable name, mostSales.
														// 
		for (int i = 0; i < salesPeopleArray.length; i++) {
			if (salesPeopleArray[i].getSales() > mostSales.getSales()) {// uses the getter to compare the Sales of salesPeopleArray[i] to our temp object
			mostSales = salesPeopleArray[i]; // if salesPeopleArray[i] has a larger Sales value, it will get assigned as our mostSales variable.
			}
		}									
		return mostSales; // once we are done iterating through the loop, it returns our mostSales SalesPerson object.
						
	}
	
	
	
	
	
	//Same thing, but looks for min Sales. 
	public static SalesPerson minSales(SalesPerson[] salesPeopleArray) {
		SalesPerson minSales = salesPeopleArray[0];
		for (int i = 0; i < salesPeopleArray.length; i++) {
			if (salesPeopleArray[i].getSales() < minSales.getSales()) {
				minSales = salesPeopleArray[i];
			}
		}
		return minSales;

	}
	
	
	
	
	
	
	
	//This method will find any SalesPerson object that has at least a certain amount of sales, and will add each object that meets this to a new array. 
	public static SalesPerson[] thresholdSales(SalesPerson[] salesPeople, double threshold) { 
		SalesPerson[] metThreshold = new SalesPerson[salesPeople.length]; //makes a new array of SalesPerson objects, the same length as the array we passed this method
		int counter = 0; //we will need a counter to assign salespeople to the right spot in the new array
		for(SalesPerson salesPerson: salesPeople) {
			if(salesPerson.getSales() >= threshold) {
				metThreshold[counter] = salesPerson;
				counter++;
			}
		}
		return metThreshold;
	}

}
