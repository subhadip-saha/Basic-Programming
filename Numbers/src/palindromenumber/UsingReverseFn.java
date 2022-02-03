package palindromenumber;

public class UsingReverseFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 121;
		int originalNum = num;			//dummy is like temp variable
		int reversedNum = reverse(num);
		
		// check if reversedNum and originalNum are equal
		if(originalNum == reversedNum) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
		
	}
	
	static int reverse(int num) {
		
		int reversedNum = 0;
		while(num != 0) {
			int remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;			
		}
		return reversedNum;
	}

}

/*
public class Main {
	   static int reverse(int X) {
	      int Y = 0;
	      while (X > 0) {
	         //Extract the last digit
	         int digit = X % 10;
	         //Appending last digit
	         Y = Y * 10 + digit;
	         // Shrinking X by discarding the last digit
	         X = X / 10;
	      }
	      return Y;
	   }
	   public static void main(String[] args) {

	      int X = 121;
	      int dummy = X;
	      int Y = reverse(X);
	      if (dummy == Y) {
	         System.out.println("Palindrome Number");
	      } 
	      else {
	         System.out.println("Not Palindrome Number");
	      }

	   }
	}  
*/
