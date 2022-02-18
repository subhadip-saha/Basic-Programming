//Java Program to Find Sum of First N Natural Numbers

package sumofnnaturalno;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum s = new Sum();
		s.getdata();
		s.calculate();
		s.print();
	}

}

class Sum
{
	int arr[];
	int ans = 0;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many natural numbers you want to add: ");
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the number: ");
			arr[i] = sc.nextInt();
		}
	}
	
	void calculate()
	{
		for(int i = 0; i < arr.length; i++)
		{
			ans = ans + arr[i];
		}
	}
	
	void print()
	{
		System.out.println("The Sum is: " + ans);
	}
}
