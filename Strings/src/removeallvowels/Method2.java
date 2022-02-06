//Java program to Remove all vowels from the String

package removeallvowels;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: \n");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		str = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println("String after removing the vowels \n" + str);
	}

}
