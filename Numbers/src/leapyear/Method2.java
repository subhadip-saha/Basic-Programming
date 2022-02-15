package leapyear;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int year=1996;
	    
	    if(check(year) == true)
	    	System.out.println("Yes, leap year");
	    else
	    	System.out.println("No");
	}
	
	static boolean check(int year)
	{
	    if(year % 400 == 0)
	    	return true;
	    if(year % 100 == 0)
	    	return false;
	    if(year % 4 == 0)
	    	return true;
	    
	    return false;
	}

}
