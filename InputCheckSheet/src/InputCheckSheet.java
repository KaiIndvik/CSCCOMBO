
public class InputCheckSheet {
	public static void main(String[] args) {
	float realNum = 987654321.987654321f;
	realNum = realNum + realNum;
	System.out.println(realNum);
	System.out.printf("$%.2f", realNum);
	System.out.println();
	System.out.printf("$%.9f", realNum);

	
		double biggerRealNum = 987654321.987654321f;
		biggerRealNum = biggerRealNum + biggerRealNum;
		System.out.println(realNum);
		System.out.printf("$%.2f", biggerRealNum);
		System.out.println();
		System.out.printf("$%.9f", biggerRealNum);
	}
}
