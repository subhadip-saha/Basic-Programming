//Search an element in an array and return its position
// Linear Search
//if found, return its position and if not print the message

package searchelement;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want: ");
		int n = sc.nextInt();
		double arr[] = new double[n];
		
		System.out.println("Enter " + n + " elements in an array");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("Enter the element you want to search: ");
		double key = sc.nextDouble();
		
		sc.close();
		
		int position = 0;
		int index = 0;
		boolean flag = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
			{
				index = i;
				position = i + 1;
				System.out.println("The element is found at index: "+ index);
				System.out.println("The element is found at position: "+ position);
				flag = true;
				break;
			}
		}
		
		if(flag == false)
			System.out.println("The element is not found");
	}

}
