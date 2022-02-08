//Java program to remove all the whitespaces from the string.
//using a character array

package removewhitespace;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Java is a programming language ";
		System.out.println("Orginal string is: " + str);
		String str2 = "";
		char[] chars = str.toCharArray();
		for(int i = 0; i < chars.length; i++)
		{
			if(chars[i] != ' ')
			{
				str2 = str2 + chars[i]; 	//or,  str2 = str2 + str.charAt(i);
			}
		}
		
		System.out.println("String after removing spaces: " +str2);
	}

}
