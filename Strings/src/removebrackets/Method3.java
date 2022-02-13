//Remove brackets from an algebraic expression
//using replaceall method

package removebrackets;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the algebraic expression: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String newstr = str.replaceAll("[()]", "");			//first one is regex, second one is replacement
		System.out.println("String after removing spaces: " + newstr);
		sc.close();
	}

}
