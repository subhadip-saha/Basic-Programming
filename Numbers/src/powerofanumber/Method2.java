
// Java program to find the power of a number
// with the help of loop

package powerofanumber;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int n = 5, k = 3;
	    int ans = 1;
	    for (int i = 0; i < k; i++) {
	      ans = ans * n;
	    }
	    System.out.print(n+" raised to the power "+k+" is "+ans);
	}

}
