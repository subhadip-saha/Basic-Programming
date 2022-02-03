/*
 * java program to find the largest element in the array.
 * Problem Statement: Given an array, we have to find the largest element in the array.
 * Intuition: We can sort the array in ascending order, hence the largest element will be at the last index of the array. 

Approach: 

Sort the array in ascending order.
Print the (size of the array -1)th index.

Time Complexity: O(N*log(N))

Space Complexity: O(n)
 */

package largestelement;

import java.util.Arrays;

public class BySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int arr1[] =  {2,5,1,3,0};
	    System.out.println("The Largest element in the array is: " + sort(arr1));
	   
	    int arr2[] =  {8,10,5,7,9};
	    System.out.println("The Largest element in the array is: " + sort(arr2));
		
	}
	
	  static int sort(int arr[]) {
		    Arrays.sort(arr);
		    return arr[arr.length - 1];
		  }

}
