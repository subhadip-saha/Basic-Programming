//java program to find the smallest element in the array.
//Problem Statement: Given an array, we have to find the smallest element in the array.
/*
Intuition: We can maintain a max variable which will update whenever the current value is greater than the value in the max variable.  

Approach: 

Create a max variable and initialize it with arr[0].
Use a for loop and compare it with other elements of the array
If any element is greater than the max value, update max value with the element’s value
Print the max variable.

Time Complexity: O(N)

Space Complexity: O(1)

*/

package largestelement;

public class ByUsingMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int arr1[] =  {2,5,1,3,0};
	    System.out.println("The Largest element in the array is: "+findLargestElement(arr1));
	 
	    int arr2[] =  {8,10,5,7,9};
	    System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
	}
	
	static int findLargestElement(int arr[]) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
			
	

}
