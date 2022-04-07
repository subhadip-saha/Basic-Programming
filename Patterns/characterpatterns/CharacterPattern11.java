/*
	print
	
	B
	LL
	UUU
	EEEE
	JJJJJ
*/

package characterpatterns;

public class CharacterPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		String str = "BLUEJ";
		int r = str.length();
		
		for(int i = 1; i <= r; i++)
		{	
			for(int j = 1; j <= i; j++)
			{
				System.out.print(str.charAt(i-1));		//(i-1) because index starts from 0, so -1 and in each row characters are fixed for all the columns, So, i 
			}
			System.out.println();
			
		}
	}

}
