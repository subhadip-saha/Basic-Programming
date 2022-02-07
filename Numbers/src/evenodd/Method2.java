//Program to Check for Even or Odd Number in Java 
//using function

package evenodd;

public class Method2 {

	
	public static int remainder(int n) {
		return (n % 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 120;
		if(remainder(num) == 0)
			System.out.println(num + " is Even");
		else
			System.out.println(num + " is Odd");
		
	}

}
