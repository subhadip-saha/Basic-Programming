////Calculate Product of the Elements of the Array

package sumofarrayelements;

import java.util.Scanner;

public class productofarrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements one by one---- ");
		System.out.println();
		
		for(int i = 0; i < size; i++) 
		{
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int product = 1;		//why 1? because anything multiplied with 1, becomes that no. itself
		
		for(int i = 0; i < size; i++)
		{
			product = product * arr[i];
		}
		
		System.out.println("The sum of the array elements: " + product);
	}

}
