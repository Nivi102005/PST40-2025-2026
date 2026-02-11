package pst;

import java.util.Scanner;
 public class upperorlowercases {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if (ch >= 'A' && ch <= 'Z') {
	            System.out.println("The character is UPPERCASE");
	        } else if (ch >= 'a' && ch <= 'z') {
	            System.out.println("The character is lowercase");
	        } else {
	            System.out.println("It is not an alphabet");
	        }
	    }
	}

