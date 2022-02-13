//Calculate the Area of the Circle


package areaofcircle;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = Math.PI * r * r;
		System.out.println("Area is: " + area);
		sc.close();
	}

}
