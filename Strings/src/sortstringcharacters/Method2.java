//Sort String Characters In Alphabetical Order without using sort method
//used function calling 

package sortstringcharacters;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str = "java";
	    int n = str.length();

	    System.out.println("Before sorting:");
	    System.out.println(str);
	    System.out.println("After sorting:");
	    System.out.println(solve(str, n));
	}
	
	public static String solve(String str, int n)
	{
		char carr[] = str.toCharArray();
		
		for(int i = 0; i < carr.length; i++)
		{
			for(int j = i + 1; j < carr.length; j++)
			{
				if(carr[i] > carr[j])
				{
					char temp = carr[i];
					carr[i] = carr[j];
					carr[j] = temp;					
				}
			}
		}
		
	    String ans = new String(carr);
	    return ans;
	}

}
