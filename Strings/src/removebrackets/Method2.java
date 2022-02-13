//Remove brackets from an algebraic expression
//using string method

package removebrackets;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the algebraic expression: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newstr = "";
		for(int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i) != '(') && (str.charAt(i) != ')'))
			{
				newstr += str.charAt(i);
			}
		}
		
		System.out.println("Result: " + newstr);
		sc.close();
	}

}
