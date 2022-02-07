//Java Program to Reverse an Array

package reverseanarray;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,-4,2,0,3,12,5};
		System.out.println("The original array is: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");	//System.out.print(arr); -> it shows fully qualified class name for 7 times
		}
		
		System.out.println();
		
		System.out.println("The reversed array is: ");
		for(int i = arr.length - 1; i >= 0; i--) 
		{
			System.out.print(arr[i] + " ");
		}

	}

}
