//Java program to Check if a number is prime or not
//user input
//using for loop
//here check constraint is of type int 

package check.prime.no;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or composite: ");
		num = sc.nextInt();
		
		for(int i = 2; i <= num - 1; i++) {		//i <= num - 1 is similar to i < num
			if(num % i == 0) {
				temp++;
				//break;					//no need to use break here
			}
		}
		
		if(temp == 0)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is composite");
		
		sc.close();
		
	}

}

