package largestelement;

import java.util.Arrays;

public class BySimplestSoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      
	     System.out.println("Given array ");
	        for (int i = 0; i < array.length; i++) {
	              System.out.print(array[i] + " ");
	        }
	        
	        System.out.println();
		        
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      
	      int largest = array[size-1];
	      System.out.println("largest element is ::"+largest);
	      
	      int thirdLargest = array[size-3];
	      System.out.println("Third largest element is ::"+thirdLargest);
	}

}
