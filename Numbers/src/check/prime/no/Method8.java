//You can also use a method where number is not predefined. Here, user has to put the number to 
//check if the number is prime.

package check.prime.no;

import java.util.Scanner;

public class Method8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int num = sc.nextInt(); 
	       sc.close();
	       
	       if (isPrime(num)) {  
	           System.out.println(num + " is a prime number");  
	       } else {  
	           System.out.println(num + " is not a prime number");  
	       } 
	}
	
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

}
