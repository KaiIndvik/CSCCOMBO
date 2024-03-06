
public class ArrayKnowledge {

	public static void main(String[] args) {
		
//		***** Problem A ******
//		char[] chars = {'a','x','x'};		
//		System.out.println(hasxx(chars));
		
//		***** Problem B *****
		
		int s = 5;
		int e = 10;
		
		int[] arr = fromToArray(s,e);
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}

	}
	


//	***** Problem A *****
	private static boolean hasxx(char[] chars) {
		for(int i = 0; i < chars.length - 1; i ++ ) {
			if ( chars[i] == 'x' && chars[i+1] == 'x') {
				return true;
			}
		}
		return false;
	}
	
//	***** Problem B *****
	
	private static int[] fromToArray(int s, int e) {
		int[] arr = new int[e-s];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = s;
			s++;
		}
		return arr;
	}
}
