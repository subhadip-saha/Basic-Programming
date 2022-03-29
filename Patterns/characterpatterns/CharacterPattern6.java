/*
	print
	
		A 
		B C 
		D E F 
		G H I J 
*/

package characterpatterns;

import java.util.Scanner;

public class CharacterPattern6 {

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
				System.out.print(p + " ");
				p++;
			}
			
			System.out.println();
		}
	}

}			
