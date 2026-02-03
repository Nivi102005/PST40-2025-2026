package pst;
class amstrongnumber{
	public static void main(String[]args) {
		        int num = 666, sum = 0, temp = num;

		        while (temp != 0) {
		            int digit = temp % 10;
		            sum += digit * digit * digit;
		            temp /= 10;
		        }

		        if (sum == num)
		            System.out.println("Armstrong number");
		        else
		            System.out.println("Not an Armstrong number");
		    }
		}



        