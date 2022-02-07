//check whether number is even or odd without using relational operator in java

package evenodd;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; 
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();

		System.out.print(isEven(num) == true ? "Even" : "Odd");

	}
	
	// Returns true if n is even, else odd
	static boolean isEven(int n)
	{
	    // n&1 is 1, then odd, else even
	    return ((n & 1) != 1);
	}
}
