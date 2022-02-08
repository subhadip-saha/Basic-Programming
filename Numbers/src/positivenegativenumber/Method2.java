//Java program to check whether a number is positive or negative
//using udf(user defined function)

package positivenegativenumber;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		check(num);
		num = -6;
		check(num);
		
	}
	public static void check(int num)
	{
		if(num > 0)
			System.out.println(num + " is positive");
		else if(num < 0)
			System.out.println(num + " is negative");
	}

}
