
public class Doubloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDoubloon("abba"));
	}
	
	public static boolean isDoubloon(String str) {
		for ( int i = 0; i < str.length(); i ++) {
			int count = 0;
			for( int j = 0; j < str.length(); j ++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count != 2) {
				return false;
			}
		}
		return true;
	}

}
