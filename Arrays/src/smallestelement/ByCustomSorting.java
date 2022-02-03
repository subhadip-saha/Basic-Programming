//To find the smallest element of the given array, first of all, sort the array.
/*
Sorting an array
	Compare the first two elements of the array
	If the first element is greater than the second swap them.
	Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
	Repeat this till the end of the array.
After sorting an array print the 1st element of the array.
*/

package smallestelement;

import java.util.Arrays;

public class ByCustomSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {10, 20, 25, 63, 96, 57};
		int size = array.length;
		int temp;
		
		//custom sorting without using readymade sort() method
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				if(array[j] < array[i]) {
					//swapping
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array ::"+Arrays.toString(array));
		System.out.println("Smallest element of the array is:: "+array[0]);
		
	      System.out.println("3rd smallest element is ::"+array[2]);
	}

}

/*
public class SmallestInArrayExample{  
public static int getSmallest(int[] a, int total){  	//here size i.e. array.length is given already 
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[0];  
}  
public static void main(String args[]){  
	int a[]={1,2,5,6,3,2};  
	int b[]={44,66,99,77,33,22,55};  
	System.out.println("Smallest: "+getSmallest(a,6));  
	System.out.println("Smallest: "+getSmallest(b,7));  
	}
}  
*/
