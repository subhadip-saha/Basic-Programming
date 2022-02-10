 //find the frequency of the specified element in an array


package countfrequency;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		frequency fr = new frequency();	
		fr.getdata();
		fr.count();	
		
	}

}

class frequency
{
	int arr[] = new int [10];
	int key;						//whose frequency is to be found
	
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers one by one:");

		for(int i = 0; i < 10; i++) 
		{
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			arr[i] = num;				//directly, arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key to find frequency:");
		key = sc.nextInt();
	}
	
	void count()
	{
		int count = 0;
		for(int i = 0; i < 10; i++) 
		{
			if(arr[i] == key)
				count++;			//count = count + 1;
		}
		
		System.out.println("The frequency of the key is" + count);
	}
}
