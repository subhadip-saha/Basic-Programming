/*
To find the largest element of the given array, first of all, sort the array.

Sorting an array
Compare the first two elements of the array
If the first element is greater than the second swap them.
Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
Repeat this till the end of the array.
After sorting an array print the 1st element from the end of the array.
*/

package largestelement;

import java.util.Arrays;

public class ByCustomSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {20, 10, 96, 63, 57, 25};
		int size = array.length;
		int temp;

		//customized sort() method
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++ ) {
				//swapping
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array ::"+Arrays.toString(array));
		System.out.println("The largest element is:: "+array[size-1]);
		System.out.println("Third largest number is:: "+array[size-3]);
	}

}
