//Java program to Check if a number is prime or not
//user input
//using while loop
//here check constraint is of type boolean 


package check.prime.no;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num, temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or composite: ");
		//capture the input in an integer
		num = sc.nextInt();
		sc.close();
		
		for(int i = 2; i <= num/2; i++) {	
			temp = num % i;
			if(temp == 0) {
				isPrime = false;
				//break;					//no need to use break here
			}
		}
		
		//If isPrime is true then the number is prime else not
		if(isPrime)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is composite");
		

	    /*										//you can also use in this way
	     	if (!isPrime)
	     		System.out.println(num + " is a composite number.");
	    	else
	      		System.out.println(num + " is a prime number.");
	     */

	}

}

/*
You can also use while loop to check the prime number:
Just replace this part of the code in above program:

for(int i=2;i<=num/2;i++)
{
   temp=num%i;
   if(temp==0)
   {
      isPrime=false;
      break;
   }
}
with this:

int i=2;
while(i<= num/2)
{
   if(num % i == 0)
   {
	isPrime = false;
	break;
   }
   i++;
}
*/