//Rearrange array in increasing-decreasing order

package rearrangingarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		if(size <= 0)
		{
			System.out.println("Array size should be greater than zero");
			System.exit(0);
		}

		
		int n1 = size%2 == 0 ? (size/2) : (size/2) + 1;
		int n2 = size - n1;
		
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		
		System.out.println("Enter the elements: ");
		
		for(int i = 0; i < n1; i++)
			first.add(sc.nextInt());		//add is predefined method of arraylist
		
		
		for(int i = 0; i < n2; i++)
			first.add(sc.nextInt());
		
		Collections.sort(first);
		Collections.sort(second, Collections.reverseOrder());
		
		for(int i = 0; i < n1; i++)
			System.out.print(first.get(i));
		
		for(int i = 0; i < n2; i++)
			System.out.print(second.get(i));
		
		sc.close();

	}
}
