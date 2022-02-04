package palindromenumber;

public class WithoutUsingReverseFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int num = 3553, reversedNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = num;
	    
	    // get the reverse of originalNum and store it in variable
	    while (num != 0) {
	    // Extract the last digit
	      remainder = num % 10;
	    // Appending last digit
	      reversedNum = reversedNum * 10 + remainder;
	   // Shrinking the number by discarding the last digit
	      num /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
		if(originalNum == reversedNum)
			System.out.println(originalNum +" is Palindrome number");
		else
			System.out.println(originalNum +" is not a Palindrome number");
	}

}
