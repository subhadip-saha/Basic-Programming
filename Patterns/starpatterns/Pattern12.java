/*
 
 	print - Left Arrow Pattern
 	   
 	   *
 	  **
 	 ***
 	****
	****
	 ***
	  **
	   *
*/ 

package starpatterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a = 1; a <= 4; a++)
		{
			for(int b = 1; b <= 4-a; b++)
			{
				System.out.print(" ");
			}
			for(int c = 1; c <= a; c++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for(int i = 1; i <= 4; i++)				//total 4 rows, in each row 4 columns divided b/w spaces and stars
		{
			//inner loop - space print
			for(int j = 1; j <= i-1; j++)		
			{
				System.out.print(" ");
			}

			//inner loop - star print
			for(int k = 1; k <= 5-i; k++)		//4-i+1
			{
				System.out.print("*");
			}		
			
			System.out.println();
		}
	}

}
