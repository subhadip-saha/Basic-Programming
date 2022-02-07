//Java program to find Largest & Smallest Numbers In Array

package nthsmallestandlargest;

import java.util.Arrays;

public class largestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {24,-10,56,-88,94};
			
		int smallest = arr[0];	//or, int smallest = Integer.MAX_VALUE; or, //int smallest = 0;
		int largest = arr[0];	//or, int largest =  Integer.MIN_VALUE; or, // int largest = 0;	
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest)
				largest = arr[i];
			else if(arr[i] < smallest)
				smallest = arr[i];
		}
		
		System.out.println("Given array: " + Arrays.toString(arr));
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}

}
