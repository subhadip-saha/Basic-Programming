/*
 * Rearrange array in increasing-decreasing order
 * Problem Statement: Rearrange the array such that the first half is arranged in increasing order, 
 * and the second half is arranged in decreasing order
 */

package rearrangingarray;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int arr[] = {8,7,1,6,5,9};
	    int n = arr.length;
	    
	    Arrays.sort(arr);			//ascending order sorting
	    
	    for (int i = 0; i < n / 2; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    for (int i = n - 1; i >= n / 2; i--) {
	      System.out.print(arr[i] + " ");
	    }
	}

}
