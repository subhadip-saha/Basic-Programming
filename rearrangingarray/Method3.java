/*
 * Rearrange array in increasing-decreasing order
 * Problem Statement: Rearrange the array such that the first half is arranged in increasing order, 
 * and the second half is arranged in decreasing order
 */


package rearrangingarray;

import java.util.Arrays;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
	    int n = arr.length;
	    printOrder(arr, n);
	}
	
	// function to print half of the array in
	// ascending order and the other half in
	// descending order
	static void printOrder(int[] arr, int n)
	{
	    // sorting the array
	    Arrays.sort(arr);
	 
	    // printing first half in ascending
	    // order
	    for (int i = 0; i < n / 2; i++)
	        System.out.print(arr[i]+" ");
	 
	    // printing second half in descending
	    // order
	    for (int j = n - 1; j >= n / 2; j--)
	    System.out.print(arr[j]+" ");
	     
	}

}
