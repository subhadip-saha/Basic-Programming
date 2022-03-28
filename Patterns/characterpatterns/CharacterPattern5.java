/*
	print
	
		A			or 	A        or		AA
		AA				A A				AA AA
		AAA				A A A			AA AA AA
		AAAA			A A A A			AA AA AA AA
*/

package characterpatterns;

import java.util.Scanner;

public class CharacterPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= r; i++)
		{	
			for(int j = 1; j <= i; j++)
			{
				System.out.print('A');				//try any one or both 
				System.out.print('A'+ " ");
			}
			
			System.out.println();
		}
	}

}			
