//Find Second Smallest and Second Largest Element in an array

package nthsmallestandlargest;

public class smallestandsecondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-1, -1, 1, 3, 8, 4, 2, 10};		//or int[] arr
		int n = arr.length;
		getElements(arr, n);
	}
	
	static void getElements(int arr[], int n) 
	{
		if(n == 0 || n == 1) {
			System.out.println("");  //array has either one or zero element, no way to find second smallest and largest
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) 
		{
			smallest = Math.min(smallest, arr[i]);
			largest = Math.max(largest, arr[i]);
		}
		
		for(int i = 0; i < n; i++) 
		{
			if(arr[i] < secondSmallest && arr[i] != smallest) 
			{
				secondSmallest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != largest) 
			{
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second smallest: " + secondSmallest);
		System.out.println("Second largest: " + secondLargest);
		
		System.out.println("smallest: " + smallest);
		System.out.println("largest: " + largest);
	}

}
