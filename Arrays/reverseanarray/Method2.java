//Java Program to Reverse an Array
//using function

package reverseanarray;

public class Method2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arr[] = {1,-4,2,0,3,12,5};
		int n = arr.length;				//n is size of the array
		reverseArray(arr, n);
	}
	
	public static void reverseArray(int arr[], int n)
	{
	      int[] ans = new int[n];
	      for (int i = n - 1; i >= 0; i--) 
	      {
	         ans[n - i - 1] = arr[i];
	      }
	      printArray(ans, n);
	}
	
	   static void printArray(int ans[], int n) 
	   {
		      System.out.print("Reversed array is:- \n");
		      for (int i = 0; i < n; i++) 
		      {
		         System.out.print(ans[i] + " ");
		      }
	   }

}
