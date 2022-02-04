/* Java Program to count vowels, consonants, digits, white spaces and special symbols in a given string */

package countvowelconsonantdigitspacesymbol;

import java.util.Scanner;

public class WithoutPassingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("\n Enter the string : ");
		str = sc.nextLine();
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

		str = str.toLowerCase();
		for(int i = 0; i < str.length(); ++i)
		{
		char ch = str.charAt(i);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		++vowels;
		}
		else if(ch >= 'a' && ch <= 'z') {
		++consonants;
		}
		else if(ch >= '0' && ch <= '9')
		{
		++digits;
		}
		else if (ch ==' ' )
		{
		++spaces;
		}
		else
		++symbols;
		}

	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	    System.out.println("Digits: " + digits);
	    System.out.println("White spaces: " + spaces);
	    System.out.println("Special Symbols: " + symbols);
	}

}
