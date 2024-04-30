
public class howManyCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(howManyCat("abc ho cat"));
		
	}
	
	public static int howManyCat(String str) {
		str = str.toLowerCase();
		int howManyCats = 0;
		if(str.length() > 3) {
			for(int i = 0; i < str.length()-2; i ++) {
				if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
					howManyCats++;
				}
			}
		}
		return howManyCats;	
		
	}

}
