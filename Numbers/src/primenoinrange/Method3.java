// Java program to find the prime numbers between a given interval
package primenoinrange;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner sc = new Scanner(System.in);
	        // Declare the variables
	        int a, b, num, i, flag;
	 
	        // Ask user to enter lower value of interval
	        System.out.printf("Enter lower bound of the interval: ");
	        a = sc.nextInt(); // Take input
	 
	        // Ask user to enter upper value of interval
	        System.out.printf("\nEnter upper bound of the interval: ");
	        b = sc.nextInt(); // Take input
	 
	        // Print display message
	        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
	 
	        // Traverse each number in the interval
	        // with the help of for loop
	        for (num = a; num <= b; num++) {
	 
	            // Skip 0 and 1 as they are
	            // neither prime nor composite
	            if (num == 1 || num == 0)
	                continue;
	 
	            // flag variable to tell
	            // if i is prime or not
	            flag = 1;
	 
	            for (i = 2; i <= num / 2; ++i) {
	                if (num % i == 0) {
	                    flag = 0;
	                    break;
	                }
	            }
	 
	            // flag = 1 means i is prime
	            // and flag = 0 means i is not prime
	            if (flag == 1)
	                System.out.print(num + " ");
	        }
	}

}
