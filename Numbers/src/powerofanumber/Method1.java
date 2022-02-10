// Java program to find the power of a number
// using Math.pow() method

package powerofanumber;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 2;
        int p = 3;
  
        System.out.println(power(num, p));
	}
	
    // Function to calculate N raised to the power P
    static double power(int N, int P)
    {
        return Math.pow(N, P);
    }

}

/*
public class Main {
	  public static void main(String args[]) {
	    double n = 2, k = 3;
	    double ans=Math.pow(n,k);

	    System.out.print(n+" raised to the power "+k+" is "+ans);
	  }
	}
*/
