
public class fromToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int end = 11;
		for(int i = 0; i < fromToArray(start, end).length; i ++) {
			System.out.println(fromToArray(start,end)[i]);
		}
	}
	
	public static int[] fromToArray(int start, int end) {
		
		int[] arr = new int[end-start];
		for(int i = start, count = 0; i < end; i ++) {
			arr[count] = i;
			count ++;
		}
		return arr;
	}

}
