import java.util.Scanner;

public class Driver {
//	In this project, we are going to be creating a sales tracking program.
//	It will allow the user to specify a number of salespeople, and it will create an array of SalesPerson objects.
//	These objects will contain a String for a name, a double for a sales amount, and an int ID number that will iterate each time a new SalesPerson object is created. 
//	
//	We will also write three methods: 
//	One that looks through the array, and returns the salesperson with the most sales.
//	One that looks through the array, and returns the salesperson with the lowest sales.
//	One that looks through the array, and returns a new array of salespeople whose Sales are greater than or equal to a value that the user inputs. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson salesPerson1 = new SalesPerson();
		SalesPerson salesPerson2 = new SalesPerson("Bob", 10.0, 1);
		SalesPerson salesPerson3 = new SalesPerson("Fred", 20.0, 2);
		
		
		salesPerson1.setName("Suzie");
		salesPerson1.setSales(50.0);
		salesPerson1.setID(5);
		
		salesPerson3.setSales(100);
	}

}
