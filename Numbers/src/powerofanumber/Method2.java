
// Java program to find the power of a number
// with the help of loop

package powerofanumber;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int n = sc.nextInt();
		System.out.println("Enter power ");
		int p = sc.nextInt();
		
	    int ans = 1;
	    
	    for (int i = 0; i < Math.abs(p); i++) {		//or,  for (int i = 1; i <=  Math.abs(p); i++)
	      ans = ans * n;
	    }
	    System.out.print(n+" raised to the power "+p+" is "+ans);
	}

}
