
public class LogicKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pickNumber(3,3,2));
	}
	public static int pickNumber(int a, int b, int c) {
		int[] numbers = {a,b,c};
		
		if(a != b && a != c && b != c ) {
			return a + b + c;
		}
		if(a == b) {
			return c;
		}
		if(b == c) {
			return a;
		}
		
		return a;
	
	}
}
