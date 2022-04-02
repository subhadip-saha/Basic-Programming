/*
	print
	
		A
		AB
		ABC
		ABCD

*/


package characterpatterns;

import java.util.Scanner;

public class CharacterPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		sc.close();
		
		
		for(int i = 1; i <= r; i++)
		{
			char p = 'A';
			for(int j = 1; j <= i; j++)
			{
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
	}

}
