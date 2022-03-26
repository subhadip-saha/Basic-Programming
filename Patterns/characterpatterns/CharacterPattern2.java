/*
print

	ABCD
	ABCD
	ABCD
	ABCD
*/

package characterpatterns;

import java.util.Scanner;

public class CharacterPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		
		for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= r; j++)
			{
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
		}
	}

}

/* if we do not typecast then o/p: 
Enter no. of rows
4
65666768
65666768
65666768
65666768
*/