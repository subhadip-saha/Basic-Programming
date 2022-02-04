//Java Program to count vowels, consonants, digits, white spaces and special symbols in a given string

//Time Complexity: O(n), n is the length of string

//Space Complexity: O(1)

package countvowelconsonantdigitspacesymbol;

public class ByPassingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Email ID is : s_saha94@gmail.com";
		int length = str.length();
		solve(str, length);
	}
	
	//here the function has two parameters - string and length
	public static void solve(String str, int length) {
		int vowels = 0, consonants = 0, digits = 0, whitespaces = 0, symbols = 0;
		str = str.toLowerCase();	// converting given string to lowercase
		
		for(int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowels++;
			else if(ch >= 'a' && ch <= 'z')
				consonants++;
			else if(ch >= '0' && ch <= '9')
				digits++;
			else if(ch == ' ')
				whitespaces++;
			else
				symbols++;
		}
		
	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	    System.out.println("Digits: " + digits);
	    System.out.println("White spaces: " + whitespaces);
	    System.out.println("Special Symbols: " + symbols);
	}
	
}

/* here length is not passed in the function
//Java Program to count vowels, consonant, digits and 
//special character in a given string
import java.io.*;

public class GFG {

 // Function to count number of vowels, consonant, 
 // digitsand special character in a string.
 static void countCharacterType(String str)
 {
     // Declare the variable vowels, consonant, digit
     // and special characters
     int vowels = 0, consonant = 0, specialChar = 0, 
         digit = 0;
   
     // str.length() function to count number of
     // character in given string.
     for (int i = 0; i < str.length(); i++) {
           
         char ch = str.charAt(i);
   
         if ( (ch >= 'a' && ch <= 'z') || 
             (ch >= 'A' && ch <= 'Z') ) {
   
             // To handle upper case letters
             ch = Character.toLowerCase(ch);
   
             if (ch == 'a' || ch == 'e' || ch == 'i' ||
                 ch == 'o' || ch == 'u')
                 vowels++;
             else
                 consonant++;
         }
         else if (ch >= '0' && ch <= '9')
             digit++;
         else
             specialChar++;
     }
       
     System.out.println("Vowels: " + vowels);
     System.out.println("Consonant: " + consonant);
     System.out.println("Digit: " + digit);
     System.out.println("Special Character: " + specialChar);
 }
   
 // Driver function.
 static public void main (String[] args)
 {
     String str = "geeks for geeks121";
       
     countCharacterType(str);
 }
}
*/