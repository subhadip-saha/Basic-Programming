//Java Program to Count Total Vowel and Consonant in a String, do not count space
// example:
//Ram Kumar   	//whenever space is encountered, ignore it.
// Ram Kumar	//First, character might be space, ignore it.

package countvowelconsonantdigitspacesymbol;

import java.util.Scanner;

public class CountVowelAndConsonantOnly {
	
	public static void main(String[] args) {
		
		String str = new String();
		int vcount, ccount;
		vcount = ccount = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the string : ");
		str = sc.nextLine();
		
		str = str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vcount++;	
				}

				else {
					ccount++;
				}
			}					
		}
		System.out.println("Total Vowels= " + vcount + " and Total Consonants= " + ccount);
		sc.close();
		
	}

}
