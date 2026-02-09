package pst;

public class sumofasciivalue {
	    public static void main(String[] args) {

	        String str = "placement";  
	        int sum = 0;               

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            sum = sum + ch;          
	        }

	        System.out.println("Sum of ASCII values: " + sum);
	    }
	}


