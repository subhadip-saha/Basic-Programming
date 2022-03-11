/*
 
 	print - Left Arrow Pattern
 	   
 	   *
 	  **
 	 ***
 	****
	 ***
	  **
	   *
*/ 

package starpatterns;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a = 1; a <= 3; a++)			//for(int i = 1; i <= 4; i++)
		{
			for(int b = 1; b <= 4-a; b++)	//for(int j = 3; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int c = 1; c <= a; c++)		//for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for(int i = 1; i <= 4; i++)				//for(int i = 1; i <= 4; i++)
		{
			//inner loop - space print
			for(int j = 1; j <= i-1; j++)		//for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}

			//inner loop - star print
			for(int k = 1; k <= 5-i; k++)		//for(int k = 3; k >= i; k--)
			{
				System.out.print("*");
			}		
			
			System.out.println();
		}
	}

}
