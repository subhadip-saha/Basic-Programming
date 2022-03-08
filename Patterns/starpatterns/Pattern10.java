/*
 
 	print - inverted half pyramid (rotated by 180 degree)
 	
 	   *
 	  **
 	 ***
 	****
*/ 	

package starpatterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter how many rows do you want to print?");
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();					//let r = 4
		
		//outer loop
		for(int i = 1; i <= r; i++)
		{
			//inner loop - space print
			for(int j = r-1; j >= i; j--)		//or, for(int j = 1; j <= r-i; j++)
			{
				System.out.print(" ");
			}
			
			//inner loop - star print
			for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
