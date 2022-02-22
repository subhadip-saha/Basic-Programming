//Java Program to find Prime Factor for a given number

package factorsandprimefactors;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2; // smallest prime number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();

		System.out.println("The prime factors of the number " + num + " is: ");

		//using while loop
		while (num > 1) 
		{
			if (num % i == 0) 
			{
				System.out.println(i);
				num = num / i;
			} else
				i++;
		}

		//using for loop
/*		 for(int i = 2; i <= num; i++) 
		 { 
			 while(num % i == 0) 
			 { 
				 num = num / i;
			 	 System.out.println(i); 
		 
			 } 
		}
*/		 


	}

}
