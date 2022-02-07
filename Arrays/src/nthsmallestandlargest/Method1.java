//Java program to Find Second Smallest and Second Largest Element in an array
//The easiest approach is to sort the array.  After sorting an array, the 
//element present at 1st index is the second smallest number in an array and the element present at
//second last index will be the second largest.
//time complexity: O(nlogn)

package nthsmallestandlargest;

import java.util.Arrays;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int arr[] = {20, 10, 25, 63, 96, 57};
		     System.out.print("Given array: ");
		        for (int i = 0; i < arr.length; i++) {
		              System.out.print(arr[i] + " ");
		        }
		        System.out.println();			//newline
	     
		  int size = arr.length;
	      Arrays.sort(arr);
	      
	     System.out.println("Sorted array: ");			//we can print either in this way
	        for (int i = 0; i < arr.length; i++) {
	              System.out.print(arr[i] + " ");
	        }
	        
	        System.out.println();		//newline
		        	
	      System.out.println("sorted Array ::"+Arrays.toString(arr));     //in this way
	      
	      int largest = arr[size - 1];
	      System.out.println("The largest element is ::"+ largest);
	      
	      int smallest = arr[0];
	      System.out.println("The smallest element is ::"+ smallest);
	      
	      int secondLargest = arr[size-2];
	      System.out.println("Second largest element is ::"+ secondLargest);
	      
	      int secondSmallest = arr[1];
	      System.out.println("Second smallest element is ::"+ secondSmallest);
	}

}
