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
