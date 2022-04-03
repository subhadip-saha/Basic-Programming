/*
	print
	
		a
		00
		bbb
		0000
		ccccc
*/

package char_and_num_pattern;

import java.util.Scanner;

public class CharNumPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		sc.close();	
		
		char p = 'a', c = 'a';
		
		for(int i = 1; i <= r; i++)
		{	
			if(i % 2 == 0)
				p = '0';
			else
				p = c++;
			
			for(int j = 1; j <= i; j++)
			{
				System.out.print(p);
			}					
			System.out.println();
			
		}
	}

}
