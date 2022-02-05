//Java program to Check if a number is prime or not
//handling the corner cases

package check.prime.no;

public class Method6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, flag = 0;
		num = 3;				//it is the number to be checked 
		if(num == 0 || num == 1) {
			 System.out.println(num +" is neither prime nor composite number");	// they represent nothingness (zero) and wholeness (one)
		} else {
			for(int i = 2; i <= num/2; i++) {
				if(num % i == 0) {
					System.out.println(num + " is not a prime number, it is a composite number");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println(num + " is a prime number.");
			}
		}
	}

}
