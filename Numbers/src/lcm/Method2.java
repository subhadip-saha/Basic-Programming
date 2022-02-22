//Find LCM of two numbers

package lcm;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
	}
	
	public static int lcm(int first_num, int second_num)
	{
		int min = 0, max = 0, h = 1;		//we might use ternary operator here instead of if-else
		if(first_num > second_num)
		{
			max = first_num;
			min = second_num;
		}
		else
		{
			max = second_num;
			min = first_num;
		}
		
		for(int i = 1; i <= min; i++)
		{
			if(min % i == 0 && max % i == 0)
			{
				h = i;
			}
		}
		
		int lcm = (min * max)/h;
		
		return lcm;
	}

}
