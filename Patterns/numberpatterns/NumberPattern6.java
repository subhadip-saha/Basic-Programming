/*
print - triangular numeric pattern 3
	
	1
	23
	456
	78910
*/

package numberpatterns;

import java.util.Scanner;

public class NumberPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int r = sc.nextInt();
		sc.close();
		
		int p = 1;
		
		/*for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(p + " ");
				p++;
			}
			System.out.println();
		}*/
		
		int i = 1;
		while(i <= r)
		{
			int j = 1;
			while(j <= i)
			{
				System.out.print(p);
				p++; //p = p + 1;
				j++;
			}
			
			System.out.println();
			i++;
		}

	}

}
