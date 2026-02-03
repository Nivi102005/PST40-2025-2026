package pst;
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean check = true;

        if (num <= 1) {
            check = false;
        } else {
            for (int i = 1; i <= 1; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
        }

        if (check) {
            System.out.println(num + " it is a prime number");
        } else {
            System.out.println(num + " it is not an prime number");
        }

        sc.close();
    }
}

