//Find LCM of two numbers

package lcm;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 8, num2 = 20, h = 1, l;		//h is hcf and l is lcm
		for(int i = 1; i <= num1; i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				h = i;
			}
		}
		
		l = (num1 * num2)/h;
		System.out.println("LCM is: " + l);
	}

}
