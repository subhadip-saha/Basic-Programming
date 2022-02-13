//Count the number of words in a given string

package countwords;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		sc.close();
		int count = 1;
		for(int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
			{
				count++; 
			}
		}
		
	    System.out.print("Number of words are ");
	    System.out.print(count);
	}

}
