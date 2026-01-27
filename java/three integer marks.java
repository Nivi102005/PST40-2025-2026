/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        float average = total / 3.0f;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
