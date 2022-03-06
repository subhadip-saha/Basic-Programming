//merging of half-pyramid and inverted half pyramid

/*
	* 				or				*
	**  							* *
 	***    							* * *
 	**** 							* * * *
 	*** 				or			* * * 
	**								* * 
 	*   							* 
 
*/

package starpatterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter how many rows do you want to print?");
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();						//let r = 4
		
		for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int k = 1; k <= r; k++)
		{
			for(int l = r-1; l >= k; l--)		//here l starts from 3, in previous pattern l started from r i.e. 4
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
