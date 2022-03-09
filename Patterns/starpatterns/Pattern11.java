/*
 
 	print -
 	
	****
	 ***
	  **
	   *
*/ 

package starpatterns;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//outer loop
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


//logic
/*
row - space - star
1		0		3
2		1		2
3		2		1
*/