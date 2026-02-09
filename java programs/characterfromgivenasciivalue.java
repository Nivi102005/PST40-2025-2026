package pst;
import java.util.Scanner;

public class characterfromgivenasciivalue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ASCII value: ");
        int ascii = sc.nextInt();

        char ch = (char) ascii;
        System.out.println("Character is: " + ch);
    }
}

