//Calculate Sum of the Elements of the Array

package sumofarrayelements;

import java.util.Scanner;

public class Method2 {

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
		
		int sum = 0;				////why 0? because anything added with 0, becomes that no. itself
		
		for(int i = 0; i < size; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("The sum of the array elements: " + sum);
	}

}
