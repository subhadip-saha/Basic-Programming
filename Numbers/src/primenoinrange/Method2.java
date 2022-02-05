//Prime Numbers in a given range
//Problem Statement: Given a and b, find prime numbers in a given range [a,b], (a and b are included here

package primenoinrange;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int a = 0, b = 17;
	    PrintPrimesbwRange(a, b);
	}
	
	  public static void PrintPrimesbwRange(int a, int b) {
		    for (int i = a; i <= b; i++) {
		      if (isPrime(i)) {
		        System.out.print(i + " ");
		      }

		    }
		  }
	
	  public static boolean isPrime(int num) {
		    if (num == 0 || num == 1)
		      return false;
		    for (int i = 2; i < Math.sqrt(num); i++) {
		      if (num % i == 0)
		        return false;
		    }
		    return true;
		  }


}
