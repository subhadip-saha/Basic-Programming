//Java program to Remove all vowels from the String

package removeallvowels;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the string to remove vowels from it: \n");
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();		
		sc.close();
		String str = s.toUpperCase();
		System.out.println("String after removing the vowels: \n");
		for(int i = 0; i < s.length(); i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || 
					str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				continue;
			}
			System.out.print(" " + str.charAt(i));
		}
		
	}

}
