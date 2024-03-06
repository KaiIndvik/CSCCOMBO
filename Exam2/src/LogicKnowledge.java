
public class LogicKnowledge {

	public static void main(String[] args) {
		
//		***** Problem A ***** 
		int a = 1;
		int b = 1;
		int c = 2;
		
		System.out.println(pickNumber(a,b,c));
		
//		***** Problem B *****
		
		int d = 3;
		int e = 9;
		int f = 6;
		
		equiDistance(d, e, f);
		
	}
	


//	***** Problem A *****
	
	private static int pickNumber(int a, int b, int c) {
		if(a == b && a == c) {
			return a;
		}
		if(a != b && b != c) {
			return a + b + c;
		}
		if(a == b && a != c) {
			return c;
		}
		if(b == c && a != b) {
			return a;
		}
		if(a == c && a != b) {
			return b;
		}
		return 0;
	}
	
//	***** Problem B *****
	
	private static void  equiDistance(int a, int b, int c) {
		System.out.println(Math.min(a,Math.min(b, c)));
		System.out.println(Math.max(a,Math.max(b, c)));
		
//		return (Math.max(a,Math.max(b, c)) - Math.min(a,Math.min(b, c)) / 2 == )
//		System.out.println(Math.max(Math.min(a, b), Math.min(b, c)));
//		int test = (a + b + c) / 3;
//		int test2 = b-a;
//		return (Math.abs((a + b + c) / 3) == Math.abs(b - a));
		
//		if (Math.abs(Math.max(Math.min(a, b) , Math.min(a, c)) - Math.min(Math.min(a, b) , Math.min(a, c))) == Math.abs(Math.max(Math.min(b, c), Math){
//			return true;
//		} return false;
//		
	}

}
