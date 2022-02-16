//Factorial of a Number(iterative way)
package factorial;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial: ");
		int num = sc.nextInt();
		sc.close();
		int facto = 1;
		int i = 1;
		while(i <= num)
		{
			facto = facto * i;
			i++;
		}
		
		System.out.println("Factorial of " + num + " is: " + facto);
	}

}
