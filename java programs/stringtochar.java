package pst;

public class stringtochar {
	public static void main(String[]args) {

		        char ch = 'A';
		        char[] arr = new char[5];
		        arr[0] = ch;
		        
		     
		        char[] s = arr; 
		        String result = "";
		        for (int i = 0; i < s.length; i++) {
		            result += s[i]; 
		        }
		        
		        System.out.println(result);
		    }
		}

		
		
		
	

	