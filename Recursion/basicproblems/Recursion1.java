//Print numbers from 5 to 1.

package basicproblems;

public class Recursion1 {

	public static void printNumbers(int n)
	{
		if(n == 0)				//base case
			return;
		
		System.out.println(n);	//print
		
		printNumbers(n-1);		//recursion
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		printNumbers(n);
	} 

}
