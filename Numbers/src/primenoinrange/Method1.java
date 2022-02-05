//Java program to print prime numbers in a given range

package primenoinrange;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scanner class object creation
		Scanner sc=new Scanner(System.in);
		//input from user
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between "+start+" and "+end+" are : ");

		
		//loop for finding and printing all prime numbers between given range
		for(int num = start; num <= end; num++)
		{
			//logic for checking number is prime or not
			int count = 0;
			for(int i = 2 ; i <= num ; i++)			//1 and 0 are neither prime nor composite
			{			
				if(num % i == 0)
					count = count+1;		//count++ or ++count
			}
			if(count == 1)
				//System.out.println(num);		//printing in the new line 
				System.out.print(num + " ");	//printing in the same line 
			
		}
		//closing scanner class(not mandatory but good practice)
		sc.close();
	}

}
