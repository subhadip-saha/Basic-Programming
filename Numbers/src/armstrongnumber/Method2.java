//Java program to Check if a number is Armstrong Number or not
//user input
//Not using in built Math.pow() function, using for loop instead
//will work for the numbers with any no. of digits 

package armstrongnumber;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int temp1 = num;
		int count = 0;			// finding number of digits
		
		while(temp1 != 0)
		{
			count++;
			temp1 = temp1 / 10;
		}
		
		int temp2 = num;
		int sumOfPower = 0;
		int rem;				//extracting the last digit
		while(temp2 != 0)
		{
			int mul = 1;
			rem = temp2 % 10;
			for(int i = 1; i <= count; i++)
			{
				mul = mul * rem;
			}
			sumOfPower = sumOfPower + mul;
			temp2 = temp2 / 10;
		}

		if(sumOfPower == num)
			System.out.println(num + " is Armstrong");
		else
			System.out.println(num + " is not Armstrong");
		
	}

}
