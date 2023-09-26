package methodPractice;

public class MethodPractice {

	public static void main(String[] args) {
	
//	***** Problem 1 ****
//	***** Method to find the smallest number *****
		
		System.out.println("Smallest Number is: " + smallestNum(25,37,29));
		System.out.println();
		
// ***** Method to compute average of three numbers *****
		
		System.out.println("The average of three numbers is: " + computeAverage(25,45,65));
		System.out.println();
	
	
//	***** Method to display middle character of a string *****
	
		System.out.println("The middle character is : " + middleChar("356870"));
		
//	*****

	}
	private static int smallestNum(int a, int b, int c) {
		if (a > b) {
			return Math.min(b, c);
		}
		return Math.min(a, c);
	
	}
	
	private static float computeAverage(int i, int j, int k) {
		
		
		return ((i+j+k)/3);
	}
	
	private static String middleChar(String str) {
		if(str.length()%2 == 0) {
			return str.substring(str.length()/2-1,str.length()/2 + 1);
		}
		return str.substring(str.length()/2,str.length()/2+1);
	}
	
	

}
