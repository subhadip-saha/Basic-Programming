/*
 	print - solid rectangle
 	
 	* * * * *
	* * * * *
 	* * * * *
 	* * * * * 
*/

package basicpatterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//naive approach 1
		
/*		for(int i = 1; i <= 4; i++)
		{
			System.out.print("*" + " ");
			System.out.print("*" + " ");		
			System.out.print("*" + " ");
			System.out.print("*" + " ");
			System.out.print("*" + " ");	//System.out.print("*" + " " + "\n");
			System.out.println();

		}
*/		
		//naive approach 2
/*		
		for(int i = 1; i <= 4; i++)
		{
			System.out.println("*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " ");
		}
*/
		
/*
 * Earlier we just prints 4 X 5 stars. But if the no. of stars increase let's say 200 X 300 stars then we have to
 * write print statement 200 times by naive approach 1 or write * 300 times by naive approach 2, which is tedious
 * job.  
 */
		//outer loop
 
		for(int i = 1; i <= 4; i++)				//no. of rows = 4
		{
			//inner loop
			
			for(int j = 1; j <= 5; j++)			//no. of columns = 5
			{
				System.out.print("*" + " ");
			}
			
			System.out.println();
		}
		
	}

}
