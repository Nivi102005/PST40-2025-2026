package pst;

public class polymorphism4 {

		public static void main(String[] args) {
			classb obj1=new classb();
			obj1.cse();
 			}

	}
	class classa{
		 void cse() {
			 System.out.println("cse is the best dept");
			 
		 }
	}
 class classb extends classa{
         void cse() {
	         System.out.println("cse is the best");
	
}
	 
	
}