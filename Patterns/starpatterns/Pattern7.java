/*
 	print - inverted half pyramid
 	
 	**** 				or				* * * *
	***  								* * *
 	**    								* *
 	* 									* 
*/

package starpatterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter how many rows do you want to print?");
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= r; i++)						//how many rows
		{
			for(int j = 4; j >= i; j--)					//in each i-th row, how many columns
			{
				System.out.print("*" + " ");		
				//System.out.print("*");				//print what?
			}
			System.out.println();
		}
	}

}
