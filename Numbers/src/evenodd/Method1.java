//Program to Check for Even or Odd Number in Java 


package evenodd;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; 
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		int rem = num % 2;
		if(rem == 0)
			System.out.println(num + " is Even");
		else
			System.out.println(num + " is Odd");
	}

}
