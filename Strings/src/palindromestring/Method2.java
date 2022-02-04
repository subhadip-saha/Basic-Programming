/*
 * NOTE  : this program has a loophole, it works fine for Subhadip, Deepak etc. that it is not palindrome
 * But Level or Radar are actually palindrome strings, for them also it shows not a palindrome string.
 * So, atfirst we have to convert them either lowercase or uppercase and then we should compare, see Method2 
 */
package palindromestring;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Radar", reversedStr="";			//Level is also palindrome
		
		for(int i = str.length()-1; i >= 0; i--) {			//--i also work
			reversedStr = reversedStr + str.charAt(i);
		}
		
		//if(str.toLowerCase().equals(reversedStr.toLowerCase()))		//either way we can use
		if(str.toUpperCase().equals(reversedStr.toUpperCase()))
			System.out.println(str + " is palindrome");
		else
			System.out.println(str + " is not palindrome");
	}

}
