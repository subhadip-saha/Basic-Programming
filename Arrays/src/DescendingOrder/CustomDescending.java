//Java Program to sort the elements of an array in descending order

/*
 * In this program, we need to sort the given array in descending order such that elements will be arranged 
 * from largest to smallest. This can be achieved through two loops. The outer loop will select an element, 
 * and inner loop allows us to compare selected element with rest of the elements.
 */

package DescendingOrder;

import java.util.Arrays;
public class CustomDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 2, 8, 7, 1}; 
		
		//We can Initialize array in this way also    
        //int [] arr = new int [] {5, 2, 8, 7, 1};     
		
		
		//We can Display elements of original array in this way also   
         /*
           	System.out.println("Elements of original array: ");    
        		for (int i = 0; i < arr.length; i++) {     
            		System.out.print(arr[i] + " ");    
        		} 
		*/
		
		System.out.println("Before sorted, given array was :" + Arrays.toString(arr));
		int temp;
		
		//whenever value of ith index is greater than the value of jth index then only swap
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					//swapping
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("After sorted in descending order:" + Arrays.toString(arr));
		
		//We can Display elements of sorted array in this way also   
		/*
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
		*/	
	}

}
