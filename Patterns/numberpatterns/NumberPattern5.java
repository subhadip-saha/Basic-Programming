/*
print - triangular numeric pattern 2
	
	1
	22
	333
	4444
*/

package numberpatterns;

import java.util.Scanner;

public class NumberPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int r = sc.nextInt();
		sc.close();
		
		//using for loop
		/*for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/

		//using while loop
		int i = 1;
		while(i <= r)
		{
			int j = 1;
			while(j <= i)
			{
				System.out.print(i);
				j++;
			}
			
			System.out.println();
			i++;
		}
	}

}
