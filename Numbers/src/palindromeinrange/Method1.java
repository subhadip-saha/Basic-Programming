//Java program to Find all Palindrome Numbers in a given range
//Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.


package palindromeinrange;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 100;
		int max = 150;
		for(int i = min; i <= max; i++) {
			if(isPalindrome(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPalindrome(int num) {
		int reversedNum = 0;
		int originalNum = num;
		
		//using while loop without taking extra variable remainder
     //   while(num > 0) {
     //       reversedNum = reversedNum * 10 + num % 10;
     //       num = num / 10;
     //   }
		
		//using while loop taking variable remainder
		while(num != 0) {			
			int remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;			
		}
        // If original number and reversed number are same, then the number is palindrome       
		if(originalNum == reversedNum)
			return true;
		else 
			return false;
	}

}
