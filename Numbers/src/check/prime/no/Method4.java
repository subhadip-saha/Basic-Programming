//Java program to Check if a number is prime or not
//user input
//using while loop
//here check constraint is of type int 

package check.prime.no;

import java.util.Scanner;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, count = 0, i = 2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check prime or not: ");
		num = sc.nextInt();
		
		while( i < num) {
			if(num % i == 0) {
				count++; 
			}
			i++;
		}
		
	      if(count == 0)
	          System.out.println("\n" +num+ " is a Prime Number.");
	      else
	          System.out.println("\n" +num+ " is not a Prime Number.");
		
	      sc.close();
	}

}
