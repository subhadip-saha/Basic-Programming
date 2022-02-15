//Check if the given year is a leap year or not.
/*
Intuition: A year is a leap year only if it satisfies the following condition.

The year is divisible by 400
The year is divisible by 4 but not by 100
*/

package leapyear;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int year = 2016;
		if(year % 400 == 0)
		{
			System.out.println("Leap year");
		}
		else if((year % 4) == 0 && (year % 100) != 0 )
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
*/	

/*		
		//Short cut of above method
		int year = 2018;
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 )
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
*/	
		//another method - multiple if-else 
		int year = 2016;
		
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
					System.out.println("Leap year");
				else
					System.out.println("Not leap year");	
			}
			else
				System.out.println("Leap year");
		}
		else
			System.out.println("Not leap year");	
	}

}
