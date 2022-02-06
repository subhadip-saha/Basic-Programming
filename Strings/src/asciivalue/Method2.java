//Java program to Find the ASCII value of a character
//user input

package asciivalue;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a character to find its ASCII value: ");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);		
		sc.close();
		int ascii = ch;
		
		System.out.println("The ASCII value of character " + ch + " is: " + ascii);
	}

}
