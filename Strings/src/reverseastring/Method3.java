//Reverse a String
//using string buffer as well as string builder 
//Both will give same o/p

package reverseastring;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String name = "Subhadip";
		
		StringBuffer sbf = new StringBuffer(name);	
		System.out.println(sbf.reverse());
		
		
		StringBuilder sbld = new StringBuilder(name);
		System.out.println(sbld.reverse());
		
		
		
	}

}
