//Reverse a String
//using character array

package reverseastring;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Subhadip";
		char a[] = name.toCharArray();
		
		String reverseName = "";
		
		int len = name.length();
		
		for(int i = (len -1) ; i>=0  ; i--)
		{
			reverseName = reverseName + a[i];
		}
		System.out.println("The reversed string is: " + reverseName);
	}
	
	

}
