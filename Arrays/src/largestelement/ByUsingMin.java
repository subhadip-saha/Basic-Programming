//java program to find the smallest element in the array.
//Problem Statement: Given an array, we have to find the smallest element in the array.
/*
Intuition: We can maintain a min variable which will update whenever the current value is less than the value in the min variable.  

Approach: 

	Create a min variable and initialize it with arr[0].
	Use a for loop and compare it with other elements of the array
	If any element is less than the min value, update min value with element’s value
	Print the min variable

Time Complexity: O(N)

Space Complexity: O(1)
 */

package largestelement;

public class ByUsingMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] =  {2,5,1,3,0};
	    System.out.println("The smallest element in the array is: "+ SmallestElement(arr1));
	    
	    int arr2[] =  {8,10,5,7,9};
	    System.out.println("The smallest element in the array is: "+ SmallestElement(arr2)); 
	}
	
	static int SmallestElement(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}				
		}
		return min;
	}			
	

}
