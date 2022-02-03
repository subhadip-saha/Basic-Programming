package palindromestring;

public class TwoPointerApproach {

	// main driver method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Input string
        String str1 = "Radar";
        String str2 = "radar";
 
        // passing bool function till holding true
        if (isPalindrome(str1))
 
            // It is a palindrome
            System.out.print(str1 + "  - Yes, palindrome");
        else
 
            // Not a palindrome
            System.out.print(str1 + "  - No, not palindrome");
        
        System.out.println();
        
        // passing bool function till holding true
        if (isPalindrome(str2))
 
            // It is a palindrome
            System.out.print(str2 + " - Yes, palindrome");
        else
 
            // Not a palindrome
            System.out.print(str2 + " - No, not palindrome");
	}
	
    // Returning true if string is palindrome
    static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
        	if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }

}

/* NOTE - 
 * Same Problem: convert to all upper or lowercase , otherwise radar will be palindrome but Radar 
 * will be not palindrome
 * if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)) or 
 * if(str.toUpperCase().charAt(i) != str.toUpperCase().charAt(j))
 */ 
