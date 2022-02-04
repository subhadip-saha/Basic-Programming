//Java program to Find all Palindrome Numbers in a range taken by user input

package palindromeinrange;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int range1, range2;
        System.out.println("Enter a range in numbers(num1-num2):");
        range1 = sc.nextInt();
        range2 = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        System.out.println(range1 + " to " + range2 + " palindrome numbers are");
        
        for (int i = range1; i <= range2; i++) {		//range1 is min and range2 is max
            num1 = i;
            num2 = 0;
            while (num1 != 0) {
                int rem = num1 % 10;				//rem is remainder
                num1 /= 10;
                num2 = num2 * 10 + rem;				//num2 is reversedNum
            }

            if (i == num2)						//i is originalNum
                System.out.print(i + " ");
        }
        sc.close();
	}

}
