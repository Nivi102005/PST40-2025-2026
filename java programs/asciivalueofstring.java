package pst;

public class asciivalueofstring {
	public static void main(String[]args) {
		String str = "placement";
        int sum = 0;               
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i); 
            sum += a;                 
        }

        System.out.println("Sum of ASCII values of \"" + str + "\" is: " + sum);
    }
}
