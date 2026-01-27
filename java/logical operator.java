/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int num1=56;
		int num2=40;
        int num3=70;
		if(num1>num3 && num2>num1)
		{
			System.out.println("both condition is true(AND)");
		}
		if (num1<num3 || num2>num1)
		{
			System.out.println("if one condition should be true(OR)");

		}
		boolean isJavaFun = true;
        if (!isJavaFun) {
            System.out.println("Java is not fun");
        } else {
            System.out.println("Java is fun");

	}

}
}
