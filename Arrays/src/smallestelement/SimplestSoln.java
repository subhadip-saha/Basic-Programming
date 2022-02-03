//You can also sort the elements of the given array using the sort method of the java.util.Arrays class then,
//print the 1st element of the array.

package smallestelement;

import java.util.Arrays;

public class SimplestSoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[] = {10, 20, 63, 25, 96, 57};
		 
	     System.out.println("Given array ");
	        for (int i = 0; i < array.length; i++) {
	              System.out.print(array[i] + " ");
	        }
		 
	     System.out.println();
		 Arrays.sort(array);	 
		 System.out.println("Sorted Array ::"+Arrays.toString(array));
		 
		 int smallest = array[0];
		 System.out.println("smallest element is ::"+ smallest);
		 
	      int thirdSmallest = array[2];
	      System.out.println("3rd smallest element is ::"+thirdSmallest);
	}

}
