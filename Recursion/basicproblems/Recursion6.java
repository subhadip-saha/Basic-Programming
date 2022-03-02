//Print factorial of a number n

package basicproblems;

public class Recursion6 {

	
	public static void calculateFactorial(int i, int num, int facto)
	{
		if(i == 5)									//base case
		{
			facto = facto * i; 
			System.out.println("factorial: " + facto);
			return;
		}
	
		facto = facto * i; 								//work done
		
		calculateFactorial(i+1, num, facto);			//recursive call
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using recursion
		
		int i = 1, num = 5, facto = 1;
		calculateFactorial(i, num, facto);
	
/*
		//using normal approach - for loop
		int num = 5;
		int facto = 1;
		
		for(int i = num; i >= 1; i--)			// using reverse traverse - 5! =5*4*3*2*1=120
		{
			facto = facto * i;
		}
		
		//for(int j = 1; j <= num; j++)			// using forward traverse - 5! =1*2*3*4*5=120
		//	facto = facto * j;
		
		System.out.println("factorial: " + facto);
*/		
	}

}
