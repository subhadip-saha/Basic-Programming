//Java Program to Find Sum of Digits of a Number

package sumofdigitsofanumber;

public class SumofDigits {

	public static void main(String[] args) {
		
		int num = 123;
		int rem, sum = 0;
		while(num != 0)			// or while(num > 0)
		{
			rem = num % 10;  	//getting remainder means extracting last digit
			sum = sum + rem;
			num = num / 10;
		}
		
		System.out.println("Sum of digits: " + sum);
	}
	
	
	/*void main(int num)
	{
		num = 123;
		int rem, sum = 0;
		while(num != 0)
		{
			rem = num % 10;  	//getting remainder means extracting last digit
			sum = sum + rem;
			num = num / 10;
		}
		
		System.out.println("Sum of digits: " + sum);
	}
	*/

}
