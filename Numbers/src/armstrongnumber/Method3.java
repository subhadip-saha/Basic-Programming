//Java program to Check if a number is Armstrong Number or not
//user input
//without using in built Math.pow() function and for loop
//but this program is applicable only upto 3 digits, for 4 digits this will fail.

package armstrongnumber;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();	
		
		int temp = num;
		int rem = 0;
		int sumOfPower = 0;
		
		while(temp > 0)					//or, while(temp != 0)
		{
			rem = temp % 10;
			sumOfPower = sumOfPower + (rem * rem * rem);	//for 0,1,153,370,371,407 will work fine
			temp = temp / 10;								//for 1634, it will not work
			//System.out.println(sumOfPower);		//debugging purpose
		}
		
		if(sumOfPower == num)
			System.out.println(num + " is Armstrong");
		else
			System.out.println(num + " is not Armstrong");

	}

}
