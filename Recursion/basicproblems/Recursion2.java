//Print numbers from 1 to 5.

package basicproblems;

public class Recursion2 {

	public static void printNumbers(int n)
	{
		if(n == 6)					//base case
			return;
		
		System.out.println(n);		//print
		
		printNumbers(n+1);			//recursion, as it is increasing by 1 at each step, so n+1
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		printNumbers(n);
	}

}


/*
iterative way
	for(int n = 1; n < 6; n++)
		System.out.println(n);
*/
