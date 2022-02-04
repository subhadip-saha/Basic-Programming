//Java program to check Character is Vowel or Consonant
/*
Scanner class in Java supports nextInt(), nextLong(), nextDouble() etc. But there is no nextChar()

To read a char, we use next().charAt(0). next() function returns the next token/word in the input as a 
string and charAt(0) function returns the first character in that string.
*/

package others;

import java.util.Scanner;

public class CheckVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character: ");
		char ch = sc.next().charAt(0);
		char ch1 = Character.toLowerCase(ch);
		
		if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
		
		sc.close();
	}

}
