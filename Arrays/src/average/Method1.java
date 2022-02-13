//Average of all the elements in the array

package average;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want: ");
		int n = sc.nextInt();	
		double arr[] = new double[n];
		
		System.out.println("Enter " + n + " elements in an array");
		double sum = 0;
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		double avg = sum / n;					//System.out.println("Average: " + sum/n); (directly write)
		System.out.println("Average: " + avg);
		
		sc.close();
		
	}

}
