//Java program to convert from Octal number system into Binary number system 

package numbersystem;

import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter an octal number: ");
		int octalNum = sc.nextInt();
		sc.close();
		
		int temp = octalNum;
		int decimalNum = 0;
		int i = 0;
		
		while(temp > 0)
		{
			//extracting last digit
			int rem = temp % 10;
			temp = temp / 10;
			
			//Math.pow returns double type number, convert from double to int
			decimalNum = decimalNum + rem * (int)Math.pow(8, i++); //post increment, so i starts from 0
		}
		
		
		System.out.println("Decimal equivalent of " + octalNum + " is: " + decimalNum);
		
		String binaryNum = "";
		int temporary = decimalNum;
		while(temporary > 0)
		{
			int remainder = temporary % 2;
			temporary /= 2;			//temporary = temporary / 2;
			//binaryNum =binaryNum + remainder;	//wrong, we have to add the remainder in reverse order
			binaryNum = remainder + binaryNum; 
		}
		
		System.out.println("Binary equivalent of " + octalNum + " is: " + binaryNum);
	}

}
