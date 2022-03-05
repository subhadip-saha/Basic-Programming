//merging of half-pyramid and inverted half pyramid

/*
	* 				or				*
	**  							* *
 	***    							* * *
 	**** 							* * * *
 	**** 				or			* * * *
	***  							* * *
 	**    							* *
 	* 								* 
 
*/

package starpatterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter how many rows do you want to print?");
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		for(int i = 1; i <= r; i++)		//how many rows? let's suppose 4 rows
		{
			for(int j = 1; j <= i; j++)	//in each i-th row, how many columns? in 1st row 1 column, in 2nd row 2 columns
			{
				System.out.print("*");	//print *
			}
			
			System.out.println();
		}
		
		for(int k = 1; k <= r; k++)		//how many rows? let's suppose 4 rows
		{
			for(int l = r; l >= k; l--)	//in each i-th row, how many columns? in 1st row r columns i.e 4 columns
			{
				System.out.print("*");	//print *
			}
			
			System.out.println();
		}
	}

}
