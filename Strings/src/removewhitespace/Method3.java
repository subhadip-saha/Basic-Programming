//Java program to remove all the whitespaces from the string.
//using in-built function

package removewhitespace;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Java is a programming language ";
		System.out.println("Orginal string is: " + str);
		String newstr = str.replaceAll(" ", "");			//first one is regex, second one is replacement
		System.out.println("String after removing spaces: " + newstr);
	}

}
