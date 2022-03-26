/*
print

	AAAA
	BBBB
	CCCC
	DDDD

*Logic: first row starts with A and continues A, second row starts with B and continues B,  third row starts with C and continues C...
*so, what is to be printed related with row number. 
*/


package characterpatterns;

import java.util.Scanner;

public class CharacterPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		
		for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= r; j++)
			{
				System.out.print((char)('A'+i-1));
				
				//char p = (char)('A'+i-1); //alternatively we can write in this way
				//System.out.print(p);
			}
			System.out.println();
		}
		
	}

}
