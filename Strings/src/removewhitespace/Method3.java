//Java program to remove all the whitespaces from the string.
//using in-built function
//user input

package removewhitespace;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a sentence: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();					//sc.next() only takes first word of the string
		sc.close();
		System.out.println("Orginal string is: " + str);
		String newstr = str.replaceAll(" ", "");			//first one is regex, second one is replacement
		System.out.println("String after removing spaces: " + newstr);
	}

}
