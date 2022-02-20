//Find GCD of two numbers

package gcdorhcf;

public class GCDorHCF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 8, num2 = 20, h = 1;
		
		for(int i = 1; i <= num1; i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				h = i;
			}
		}
		System.out.println("GCD or HCF is: " + h);
	}

}
