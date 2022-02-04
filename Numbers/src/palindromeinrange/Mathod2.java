//Java program to Find all Palindrome Numbers in a given range

package palindromeinrange;

public class Mathod2 {

	 // Driver Code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countPalindrome(100, 150);
	}
	
    // prints palindrome between min and max
	static void countPalindrome(int min, int max) {
		for(int i = min; i <= max; i++) {
			if(isPalindrome(i) == 1)
				System.out.print(i + " ");
		}
	}
	
    // A function to check if n is palindrome
    static int isPalindrome(int n)
    {
         
        // Find reverse of n
        int rev = 0;
        //using for loop
        for (int i = n; i > 0; i /= 10)		//i = i / 10;
            rev = rev * 10 + i % 10;
             
        // If n and rev are same,
        // then n is palindrome
        return(n == rev) ? 1 : 0;
    }
		
	
}
