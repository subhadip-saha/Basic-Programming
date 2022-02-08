//Java program to count the number of spaces in the string.

package others;

public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Java is a programming language. I like it..";
		System.out.println("Orginal string is: " + str);
		int count = 0;
		int i;
		for(str.charAt(i = 0); i < str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				count++;
			}
		}
		
		System.out.println("No. of spaces in the string: " + count);
	}

}
