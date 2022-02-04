package palindromestring;

import java.util.Scanner;

public class StringUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str, reversedStr="";	
	    Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter a string: ");
	      str = sc.nextLine();
	      
			for(int i = str.length()-1; i >= 0; i--) {			//--i also work
				reversedStr = reversedStr + str.charAt(i);
			}
			
			//if(str.toLowerCase().equals(reversedStr.toLowerCase()))		//either way we can use
			if(str.toUpperCase().equals(reversedStr.toUpperCase()))
				System.out.println(str + " is palindrome");
			else
				System.out.println(str + " is not palindrome");
	}

}
