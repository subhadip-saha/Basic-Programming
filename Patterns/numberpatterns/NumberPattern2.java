/*
print - square numeric pattern 1
	
	1234
	1234
	1234
	1234
*/

package numberpatterns;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int r = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= r; i++)	//as it is square pattern, it will go upto row(r) for both i and j
		{
			for(int j = 1; j <= r; j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
