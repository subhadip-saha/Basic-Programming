//Find LCM of three numbers

package lcm;

import java.util.Scanner;

public class Method3 {

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
		int min = 0, max = 0, x, lcm = 0;
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
			x = max * i;
			if(x % min == 0)
			{
				lcm = x;
				break;
			}
		}
		return lcm;
	}
}
