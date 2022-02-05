//Java program to Check if a number is prime or not

package check.prime.no;

public class Method1 {

	public static boolean isPrime(int N) {
		for(int i = 2; i < N; i++) {
			if(N % i == 0) { 
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 20;		//it is the number to be checked  
		boolean ans = isPrime(num);
		
		if(ans == true)
			System.out.println("Prime number");
		else 
			System.out.println("Not a prime number");
	}
	
	

}
