package pst;

public class stringtointeger {
	public static void main(String[]args) {
		String s="123";
		int num = 0;
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
			int digit = ch - '0';
			num = num * 10+ digit;
			System.out.println("integer:"+ num);
			}
		}
	}