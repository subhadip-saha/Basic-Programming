//Remove brackets from an algebraic expression
//using character array

package removebrackets;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the algebraic expression: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		String newstr = "";

		for(int i = 0; i < ch.length; i++)
		{
			if (ch[i] != '(' && ch[i] != ')')	//don't use 'OR' operator - ||
			{
				newstr =  newstr + ch[i];
			}
		}
		
		System.out.println("Result: " + newstr);
		sc.close();
	}

}
