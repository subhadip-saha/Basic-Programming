/*
print - triangular numeric pattern 1
	
	1
	12
	123
	1234
*/

package numberpatterns;

import java.util.Scanner;

public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int r = sc.nextInt();
		sc.close();
		
		/*for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			
			System.out.println()
		}*/
		
		int i = 1;
		while(i <= r)
		{
			int j = 1;
			while(j <= i)
			{
				System.out.print(j);
				j = j + 1; //j++
			}
			System.out.println();
			i = i + 1; //i++
		}
	}

}
