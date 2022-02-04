//Java Program to Count Total Vowel and Consonant in a String, do not count space

package countvowelconsonantdigitspacesymbol;

public class UsingSeparateMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Subhadip";
		countVowels(str);
	}
	
	public static void countVowels(String str) {
		int vcount = 0;
		int ccount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(isVowel(str.charAt(i)))
				++vcount;
			else
				++ccount;			
	}
		System.out.println("Vowel count: " + vcount);
		System.out.println("Consonant count: " + ccount);
}
	public static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}
}
	
