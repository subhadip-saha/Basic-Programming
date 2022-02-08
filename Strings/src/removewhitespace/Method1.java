//Java program to remove all the whitespaces from the string.
//Direct method, not using a character array

package removewhitespace;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Java is a programming language ";
		System.out.println("Orginal string is: " + str);
		String str2 = "";
		int i;
		for(str.charAt(i = 0); i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				str2 = str2 + str.charAt(i);	//append
			}
		}
		System.out.println("String after removing spaces: " + str2);
	}

}
