//Java program to convert from Decimal number system into Octal number system

package numbersystem;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a decimal number: ");
		int decimalNum = sc.nextInt();
		sc.close();
		
		String octalNum = "";
		int temporary = decimalNum;
		while(temporary > 0)
		{
			int remainder = temporary % 8;
			temporary /= 8;			//temp = temp / 8;
			//decimalNum =decimalNum + rem;	//wrong, we have to add the remainder in reverse order
			octalNum = remainder + octalNum; 
		}
		
		System.out.println("Octal equivalent of " + decimalNum + " is: " + octalNum);
	}

}
