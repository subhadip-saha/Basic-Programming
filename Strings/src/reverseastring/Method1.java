//Reverse a String
//using + i.e. string concatenation operator

package reverseastring;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Subhadip";
		int len = name.length();
		
		//String reverseName = null; 			// then o/p nullpidahbuS
		String reverseName = "";
		
		
		for(int i = (len -1) ; i>=0  ; i--)
		{
			reverseName = reverseName + name.charAt(i);
		}
		System.out.println("The reversed string is: " + reverseName);
	}

}

