//Java program to check whether a number is positive or negative

package positivenegativenumber;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num > 0)
			System.out.printf("%d is a positive number", num);
		else if(num < 0)
			System.out.printf("%d is a negative number", num);
		else
			System.out.printf("%d is zero, neither positive nor negative", num);
	}

}
