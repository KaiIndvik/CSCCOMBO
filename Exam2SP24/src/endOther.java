
public class endOther {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(endOther("abc", "hiabc"));
	}
	
	public static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if(a.length() >= b.length() && (a.substring(a.length()-b.length()).equals(b))) {
			return true;
		}
		if(b.length() >= a.length() && (b.substring(b.length()-a.length()).equals(a))) {
			return true;
		}
		return false;
	}

}
