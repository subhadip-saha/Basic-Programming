//Print numbers from 5 to 1.

package basicproblems;

public class Recursion1 {

	public static void printNumbers(int n)
	{
		if(n == 0)				//base case
			return;
		
		System.out.println(n);	//print
		
		printNumbers(n-1);		//recursion, as it is decreasing by 1 at each step, so n-1
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		printNumbers(n);
	} 

}

/*
	iterative way
		for(int n = 5; n > 0; n--)
			System.out.println(n);
*/