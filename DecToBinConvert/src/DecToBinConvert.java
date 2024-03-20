public class DecToBinConvert {
    public static void main(String[] args) {
        int decimal = 25; // Example decimal number
//        String binary = decimalToBinary(decimal);
//        System.out.println("Binary representation of " + decimal + " is: " + binary);
        decToBinConvert(25);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        return decimalToBinaryHelper(decimal, "");
    }

    public static String decimalToBinaryHelper(int decimal, String binary) {
        if (decimal == 0) {
            return binary;
        }
        return decimalToBinaryHelper(decimal / 2, (decimal % 2) + binary);
    }
    
    public static void decToBinConvert(int num) {
    	if(num == 0) {
    		System.out.println(num);
    	}
    	decToBinConvert(num%2);
    }
}