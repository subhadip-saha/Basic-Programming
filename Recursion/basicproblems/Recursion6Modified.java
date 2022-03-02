/*
 * Print factorial of a number n
 * n! = n * (n-1)!
 * n! = n * (n-1) * (n-2) * (n-3) * ... * 1
 * 5! = 5*4*3*2*1
 * 3! = 3*2*1
 * 2! = 2*1
 * 1! = 1
 * 0! = 1
 */

package basicproblems;

public class Recursion6Modified {

	public static int calcFactorial(int n)
	{
		if(n == 1 || n == 0)					//base case
			return 1;
		
		int fact_nm1 = calcFactorial(n-1);		//recursive call
		
		int fact_n = n * fact_nm1;				//main work
		return fact_n;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int ans = calcFactorial(n);
		System.out.println("Factorial: " + ans);
	}

}
