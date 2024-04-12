
public class ArrayKnowledge {

	public static void main(String[] args) {
		
		char[] characters = {'a','x','y', 'x', 'x'};
		System.out.println(hasxx(characters));
		
	}
	
	public static boolean hasxx(char[] characters) {
		for(int i = 0; i < characters.length - 1; i ++) {
			if(characters[i] == 'x' && characters[i+1] == 'x') {
				return true;
			}
		}
		return false;
	}

}
