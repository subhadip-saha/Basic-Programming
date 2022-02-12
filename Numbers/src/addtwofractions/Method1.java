//Program to Add two fractions

package addtwofractions;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d;
		int num = 0;	//numerator after the addition
		int den = 0;	//denominator after the addition
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator of first number: ");
		a = sc.nextInt();
		System.out.println("Enter denominator of first number: ");
		b = sc.nextInt();
		System.out.println("Enter numerator of second number: ");
		c = sc.nextInt();
		System.out.println("Enter denominator of second number: ");
		d = sc.nextInt();
		
		if(b == d)
		{
			num = a + c;
			den = b;     // or den = d;
		}
		else
		{
			num = (a*d)+(c*b);
			den = b*d;
		}
		System.out.println("The numerator of the result after the addition: " + num);
		System.out.println("The denominator of the result after the addition: " + den);
		System.out.println("Result: " + num + "/" + den);
				
	}

}
