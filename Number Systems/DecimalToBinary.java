//Java program to convert from Decimal number system into Binary number system 

package numbersystem;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a decimal number: ");
		int decimalNum = sc.nextInt();
		sc.close();
		
		String binaryNum = "";
		int temp = decimalNum;
		while(temp > 0)
		{
			int rem = temp % 2;
			temp /= 2;			//temp = temp / 2;
			//decimalNum =decimalNum + rem;	//wrong, we have to add the remainder in reverse order
			binaryNum = rem + binaryNum; 
		}
		
		System.out.println("Binary equivalent of " + decimalNum + " is: " + binaryNum);
	}

}
