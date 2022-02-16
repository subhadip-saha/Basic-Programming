//Factorial of a Number(iterative way)
package factorial;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial: ");
		int num = sc.nextInt();
		sc.close();
		int facto = 1;
		
		 for(int i = 1; i <= num; i++) 		// ascending order, 5! = 1*2*3*4*5 = 120 
		{
			facto = facto * i;
		}
		 
		 /*
		  * for(int i = num; i >= 1; i--)		//descending order, 5! = 5*4*3*2*1 = 120
		  * {
		  * 	facto = facto * i;
		  * }
		  */
		
		System.out.println("Factorial of " + num + " is: " + facto);
	}

}
