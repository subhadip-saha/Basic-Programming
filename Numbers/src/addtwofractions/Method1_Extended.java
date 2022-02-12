//Program to Add two fractions
//here we can reduce the fraction

package addtwofractions;

import java.util.Scanner;

public class Method1_Extended {

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
		
		if(b == d)						//if denor. of both fractions are equal 
		{
			num = a + c;
			den = b;     // or den = d;
		}
		else							//if denor. of both fractions are not equal 
		{	
			num = (a*d)+(c*b);
			den = b*d;
			
			int min = Math.min(num, den);
			for(int i = 2; i <= min; i++)
			{
				if(num % i == 0 && den % i == 0)
				{
					num = num / i;
					den = den / i;
				}
			}
		}
		
		if(num % den == 0)
		{
			int result = num / den;
			System.out.println("The numerator of the result after the addition: " + num);
			System.out.println("The denominator of the result after the addition: " + den);
			System.out.println("Result: " + result);
		}
		else
		{
			System.out.println("The numerator of the result after the addition: " + num);
			System.out.println("The denominator of the result after the addition: " + den);
			System.out.println("Result: " + num + "/" + den);
		}

	}

}
