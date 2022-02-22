//Java Program to find Factors for a given number

package factorsandprimefactors;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("The factors of the number " + num + " is: ");
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
				System.out.println(i + " ");
		}
		
		sc.close();
		
	}

}
