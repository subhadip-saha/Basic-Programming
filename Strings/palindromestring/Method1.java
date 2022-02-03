//Java Program to Check Palindrome String
/*
 * To check a Palindrome in Java, we first reverse the string or number and compare the reversed string 
 * or number with the original value.
 *
 *Palindrome string example: Radar, Level, kayak
 *Palindrome number example: 3773, 12321
 */
package palindromestring;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Subhadip", reversedStr = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		
		if(str.equals(reversedStr))
			System.out.println("Palindrome string");
		else
			System.out.println("Not a palindrome string");
	}

}

/*
 * NOTE  : this program has a loophole, it works fine for Subhadip, Deepak etc. that it is not palindrome
 * But Level or Radar are actually palindrome strings, for them also it shows not a palindrome string.
 * So, atfirst we have to convert them either lowercase or uppercase and then we should compare, see Method2 
  */
