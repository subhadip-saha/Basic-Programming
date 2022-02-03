/* Java program to Check if the given String is Palindrome or not
 * Problem Statement: “Given a string, check if the string is palindrome or not.”  
 * A string is said to be palindrome if the reverse of the string is the same as the string.
 * Time Complexity:  O(N)
 * Space Complexity: O(1)
 */

package palindromestring;

public class Method3 {

	static private boolean isPalindrome(String str) {
		for(int i = 0; i <= str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCDCBA";
		
		boolean ans = isPalindrome(str);
		
		if(ans == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	
	}

}
