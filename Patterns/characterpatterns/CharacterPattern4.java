/*
print

	ABCD
	BCDE
	CDEF
	DEFG

*Logic: first row starts with A and then increasing, second row starts with B and then increasing
*so, what is to be printed related with row number. 

*/

package characterpatterns;

import java.util.Scanner;

public class CharacterPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		
		for(int i = 1; i <= r; i++)
		{
			char p = (char)('A'+i-1);
			
			for(int j = 1; j <= r; j++)
			{
				System.out.print(p);
				p++;
				//p = (char)(p + 1); or we can write this.
			}
			System.out.println();
		}
	}

}
