//Java program to Find Second Smallest and Second Largest Element in an array
//using functions

package nthsmallestandlargest;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 4, 6, 7, 5};
		int n = arr.length;
		getElements(arr, n);

	}
	
	static private void getElements(int[] arr, int n)
	{
		if (n == 0 || n==1)
		{
			System.out.print("Invalid");

		}
		Arrays.sort(arr);
		int small = arr[1];
		int large = arr[n - 2];
		System.out.println("Second smallest is "+small);
		System.out.println("Second largest is "+large);
	}

}
