/*
 	print - solid rectangle
 	
 	* * * * *
	* * * * *
 	* * * * *
 	* * * * * 

as it is rectangular pattern, so no. of rows is not equal to no of columns, here we have taken no. of rows is 1
greater than no of columns

*/


package starpatterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter how many rows do you want to print?");
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		sc.close();

/*		
		// using for loop
		for(int i = 1; i <= r; i++)				//how many rows
		{
			for(int j = 1; j <= r + 1; j++)		//in each i-th row, how many columns - 
			{
				System.out.print("*" + " ");	//print what?
			}
			
			System.out.println();
		}
*/		
		
		//using while loop
		int i = 1;
		while(i <= r)							//how many rows
		{	
			int j = 1;
			while(j <= r+1)						//in each i-th row, how many columns
			{
				System.out.print("*" + " ");	//print what?
				j++;					
			}
			System.out.println();
			i++;
		}
		
	}

}
