// Java program to Sort a Subarray in Array

/*
Syntax: sort() Method 

Arrays.sort(); 
Syntax: Overloaded sort() Method

public static void sort(int[] arr, int from_Index, int to_Index) ;
Parameters: It takes three parameters as can be perceived from the syntax which is as follows:

The array to be sorted
The index of the first element, inclusive, to be sorted (Referred to as from_index)
The index of the last element, exclusive, to be sorted (Referred to as last_index)
Return Type: It does not return any value.
*/

// Using Arrays.sort() method

package sortmethodexamples;

//Importing Arrays class from java.util package
import java.util.Arrays;

public class SortSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Custom input array
        // It contains 8 elements as follows
        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
  
        // Sort subarray from index 1 to 4, i.e., only sort subarray {7, 6, 45, 21} and 
        //keep other elements as it is.
        Arrays.sort(arr, 1, 5);
  
        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        System.out.println("Modified arr[] :" +  Arrays.toString(arr));
	}

}
