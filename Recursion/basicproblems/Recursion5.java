//print Hello World 5 times

package basicproblems;

public class Recursion5 {

	public static void printHW(int n)
	{
		if(n == 6)					//base case
		{
			return;
		}
		
		System.out.println("Hello World");	//main work
		
		printHW(n+1);						//recursive call
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;			//initially
		printHW(n);
	}

}
