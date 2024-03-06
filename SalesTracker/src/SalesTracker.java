import java.util.Scanner;

public class SalesTracker {

	public static void main(String[] args) {
		//Creates Scanner
		Scanner scn = new Scanner(System.in); 
		
		//Asks user for how many salespeople there are
		System.out.println("How many salespeople would you like to enter information for?");
		int numSalesPeople = scn.nextInt();
		
		//initializes some variables
		double[] saleAmounts = new double[numSalesPeople];
		double maxSale = 0;
		double minSale = 0;
		double totalSales = 0;
		
		//Gathers sales amounts from Scanner for each salesPerson
		for(int i = 0; i <saleAmounts.length; i++) {
			System.out.println("Please input the sales amount for salesperson " + (i + 1) + ";");
			
			saleAmounts[i] = scn.nextDouble();
			//
			if(minSale == 0 || saleAmounts[i] < minSale) { // If minSale = 0, then I know this is the first time through the loop (because minSale was initialized at 0), and the next sale amount entered will be the minimum by default.
				minSale = saleAmounts[i];
			}
			if (saleAmounts[i] > maxSale){
				maxSale = saleAmounts[i];
			}
			totalSales += saleAmounts[i];
		}
		
		//Prints required information
		System.out.println("The maximum sale was " + maxSale + " by salesperson " + indexOfMax(saleAmounts)); // Calls method to find index of max sale
		System.out.println("The minimum sale was " + minSale + " by salesperson " + indexOfMin(saleAmounts)); // Calls method to find index of min sale
		System.out.println("The total sales were " + totalSales);
		System.out.println("The average sale amounts was " + (totalSales / numSalesPeople));
		
		System.out.println("Enter a value: I will print the ID of each salesperson that exceeded this amount.");
		
		//Initialize relevant variables
		double thresholdSale = scn.nextDouble();
		double thresholdSalesSum = 0;
		int thresholdSalespeople = 0;
		
		
		for(int i = 0; i < saleAmounts.length; i ++) {
			if(saleAmounts[i] > thresholdSale) {
				System.out.println("Salesperson " + (i + 1) + " sold $" + saleAmounts[i] );
				thresholdSalesSum += saleAmounts[i];
				System.out.println();
				thresholdSalespeople++;
			}
		}
		
		System.out.println("There were " + thresholdSalespeople + " salepeople that has sales above the threshold of $" + thresholdSale + ".\nThe sum of all sales above the threshold of $" + thresholdSale + " is " + thresholdSalesSum);
		
		
		
	}
	
	public static int indexOfMax(double[] saleAmounts) {
		int maxIndex = -1;
		double maxValue = -1;
		for(int i = 0; i < saleAmounts.length; i ++) {
			if(saleAmounts[i] > maxValue) {
				maxValue = saleAmounts[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static int indexOfMin(double[] saleAmounts) {
		int minIndex = -1;
		double minValue = -1;
		for(int i = 0; i < saleAmounts.length; i ++) {
			if(minValue == -1 || saleAmounts[i] < minValue) { // if minValue = -1, I know that this is the first time through the loop. This means I want to assign the next value as the minimum, by default because it's the first one.
				minValue = saleAmounts[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	
}
