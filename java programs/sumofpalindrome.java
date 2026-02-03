package pst;
import java.util.Scanner;

public class sumofpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // Check palindrome
        if (original == reverse) {
            int sum = 0;
            int temp = original;

            // Find sum of digits
            while (temp != 0) {
                sum = sum + (temp % 10);
                temp = temp / 10;
            }

            System.out.println("The number is a Palindrome");
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("The number is NOT a Palindrome");
        }

        sc.close();
    }
}
