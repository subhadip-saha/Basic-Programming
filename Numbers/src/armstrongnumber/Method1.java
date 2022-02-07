//Java program to Check if a number is Armstrong Number or not
//Using in built Math.pow() function

package armstrongnumber;

public class Method1 {
	
	public static boolean isArmstrong(int num)
	{
		int originalNo = num;
		int temp = num;
		int sumOfPower = 0;
		int count = 0;
		
		while(temp != 0)
		{
			temp /= 10;
			count++;
		}
		
		while(num != 0)
		{
			int digit = num % 10;
			sumOfPower += Math.pow(digit, count);	// sumOfPower = sumOfPower + Math.pow(digit, count);
			num /= 10;								//num = num / 10;
		}
		
		if(originalNo == sumOfPower)
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int num = 1634;
		if(isArmstrong(num))
		{
			System.out.println("Yes, " + num + " it is an Armstrong Number\n");
		}
		else
		{
			System.out.println("No, " + num + " it is not an Armstrong Number\n");
		}
		
	}
	


}
