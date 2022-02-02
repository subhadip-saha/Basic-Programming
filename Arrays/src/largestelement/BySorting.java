//java program to find the smallest element in the array.
//Problem Statement: Given an array, we have to find the smallest element in the array.
//Intuition: We can sort the array in ascending order, hence the smallest element will be at the 0th index. 
//Approach - Sort the array in ascending order.
//			 Print the 0th index.
//Time Complexity: O(N*log(N))

//Space Complexity: O(1)

package largestelement;

import java.util.Arrays;

public class BySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {2,5,1,3,0};
		System.out.println("The smallest element in the array is: " + sort(arr1));
		
		int arr2[] =  {8,10,5,7,9};
	    System.out.println("The smallest element in the array is: " + sort(arr2));
		
	}
	
	static int sort(int arr[]) {
		Arrays.sort(arr);
		return arr[0];
	}

}
