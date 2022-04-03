/*
	print
	
		ABCDE
		ABCD
		ABC
		AB
		A
*/

package characterpatterns;

import java.util.Scanner;

public class CharacterPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		sc.close();
		
		
		
		for(int i = 1; i <= r; i++)
		{	
			char p = 'A';
			
			//for(int j = r; j >= i; j--)		//any one can get the answer
			for(int j = 1; j <= r-i+1; j++)
			{
				System.out.print(p);
				p++;
			}					
			System.out.println();
			
		}
	}

}
