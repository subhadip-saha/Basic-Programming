//Factorial of a Number(iterative way)
package factorial;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		int ans = factorial(num);
		System.out.println("Factorial of " + num + " is: " + ans);
	}
	
	public static int factorial(int n)
	{
		int facto = 1;
		for(int i = 5; i >= 1; i--)
		{
			facto = facto * i;
		}
		
		return facto;
	}

}
