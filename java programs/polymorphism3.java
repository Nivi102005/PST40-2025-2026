package pst;

public class polymorphism3 {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=30;
     System.out.println (add(a,b));
     System.out.println(add(a,b,c));
     

	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}

}
