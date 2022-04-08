/*
	print
	
	B
	BL
	BLU
	BLUE
	BLUEJ
*/

package characterpatterns;

public class CharacterPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "BLUEJ";
		int r = str.length();
		
		for(int i = 1; i <= r; i++)
		{	
			for(int j = 1; j <= i; j++)
			{
				System.out.print(str.charAt(j-1));	//(j-1) because index starts from 0, so -1 and in each row characters are fixed for all the columns, So, j
			}
			System.out.println();
			
		}
	}

}
