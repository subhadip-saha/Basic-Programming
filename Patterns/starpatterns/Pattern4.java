/*
 	print - solid square
 	
 	* * * * 
	* * * * 
 	* * * * 
 	* * * * 
*/

package starpatterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter how many rows do you want to print?");
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

/* 		// using for loop
		for(int i = 1; i <= r; i++)				//how many rows
		{
			for(int j = 1; j <= r; j++)			//in each i-th row, how many columns 
			{
				System.out.print("*" + " ");	//print what?
			}
			
			System.out.println();
		}
*/		
		//using while loop
		
		int i = 1;
		while(i <= r)								//how many rows
		{
			int j = 1;
			while(j <= r)							//in each i-th row, how many columns 
			{
				System.out.print("*" + " ");		//print what?
				j++;								//remember this increment, otherwise infinite loop
			}
			System.out.println();
			i++;									//remember this increment, otherwise infinite loop
		}
		
		sc.close();
	}

}
