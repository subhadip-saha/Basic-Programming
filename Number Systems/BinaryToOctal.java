//Java program to convert from Binary number system into Octal number system 

package numbersystem;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a binary number: ");
		int binaryNum = sc.nextInt();
		sc.close();
		
		int temp = binaryNum;
		int decimalNum = 0;
		int i = 0;
		
		while(temp > 0)
		{
			//extracting last digit
			int rem = temp % 10;
			temp = temp / 10;
			
			//Math.pow returns double type number, convert from double to int
			decimalNum = decimalNum + rem * (int)Math.pow(2, i++); //post increment, so i starts from 0
		}
		
		
		System.out.println("Decimal equivalent of " + binaryNum + " is: " + decimalNum);
		
		
		String octalNum = "";
		int temporary = decimalNum;
		while(temporary > 0)
		{
			int remainder = temporary % 8;
			temporary /= 8;			//temp = temp / 2;
			//decimalNum =decimalNum + rem;	//wrong, we have to add the remainder in reverse order
			octalNum = remainder + octalNum; 
		}
		
		System.out.println("Octal equivalent of " + binaryNum + " is: " + octalNum);
	}

}
