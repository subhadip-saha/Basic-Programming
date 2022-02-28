// Print the sum of first n natural numbers
// forward traverse

package basicproblems;

public class Recursion3 {

	public static void printSum(int i, int n, int sum)
	{
		//base case, at n=5, program will return the sum but before that we have to calculate the sum for n = 5
		//also, print the sum and then finally return
		if(i == 5)						
		{
			sum += i;
			System.out.println(sum);
			return;
		}
		
		sum = sum + i;				//sum += i;		calculate the sum
		
		printSum(i+1, n , sum);		//in next step i is increased by one step, 		//recursive call
		
		//this is for testing purpose, it shows, while returning, print the values of i in each step as 
		//one block is being deleted from the stack memory in each step till we reach main
		//System.out.println(i);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//here I want to calculate the sum of first 5 natural numbers
		printSum(1, 5, 0);	//no. starts from 1 and sum is initially 0
		
	}
	
	
	
/*	my thinking
	public static void printSum(int i, int n, int sum)
	{
		if(i == 5)						//base case
		{
			sum = sum + i;
			System.out.println(sum);
			return;
		}
		
		sum = sum + i;					//main work
		
		printSum(i+1, n, sum);			//recursive call
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, n = 5, sum = 0;				//initially
		printSum(i, n, sum);
*/		

}
