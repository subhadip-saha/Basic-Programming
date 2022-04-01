/*
	print
	
		A
		BB
		CCC
		DDDD
*/


package characterpatterns;

import java.util.Scanner;

public class CharacterPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		sc.close();
		
		char p = 'A';
		
		for(int i = 1; i <= r; i++)
		{	
			for(int j = 1; j <= i; j++)
			{
				System.out.print(p);
			}					
			System.out.println();
			p++;
		}
	}

}
