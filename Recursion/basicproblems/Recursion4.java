// Print the sum of first n natural numbers
// reverse traverse

package basicproblems;

public class Recursion4 {

	public static void printSum(int i, int n, int sum)
	{
		if(i == 1)
		{
			sum = sum + i;
			System.out.println(sum);
			return;
		}
		
		sum = sum + i;
		
		printSum(i-1, n, sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//now we are summing from n = 5 till n = 1
		int i = 5, n = 1, sum = 0;				//initially
		printSum(i, n, sum);
	}

}
