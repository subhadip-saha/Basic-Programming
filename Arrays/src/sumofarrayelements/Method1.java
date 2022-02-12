//Calculate Sum of the Elements of the Array

package sumofarrayelements;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int n = 5;
	    int arr[] = {1,2,3,4,5};
	    int sum = 0;
	    for (int i = 0; i < n; i++) {
	      sum += arr[i];		//sum = sum + arr[i];
	    }
	    System.out.println("The sum of the elements of the array is "+sum);
	}

}
