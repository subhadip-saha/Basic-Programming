
// Java Program to Sort Array of Integers
// by Default Sorts in an Ascending Order
// using Arrays.sort() Method
  
package sortmethodexamples;

//Importing Arrays class from the utility class
import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
  
        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);
  
        // Printing the array after sorting
        System.out.println("Modified arr[] : " +  Arrays.toString(arr));
	}

}
