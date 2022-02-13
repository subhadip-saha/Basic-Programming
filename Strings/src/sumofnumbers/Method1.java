//Sum of the Numbers in a String
// it doesn`t work correctly with numbers at the end of String (Like this for example "aa11b33")
package sumofnumbers;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="hello57dk25gautam";
		 String temp = "0";						//String temp = "";
		 int sum = 0;
		 for(int i = 0; i < str.length(); i++)
		 {
			 char ch = str.charAt(i);				// if(Character.isDigit(str.charAt(i)))
			 
			//if the character is a digit
			 if(Character.isDigit(ch))			
			 {
				temp += ch;		//temp = temp + ch;
			 }
			 //if the character is not a digit means it is alphabet
			 else
			 {
				 sum = sum + Integer.parseInt(temp);
				 temp = "0";							//temp="";
			 }
		 }
		 System.out.println(sum);
	}

}

/*
 * Same program, but it will not work
class DigitSum
{
   public static void main(String[] args)
   {
       String str="hello57dk25gautam";
       String num="";
       int sum=0;
       for(int i=0;i<str.length();i++)
       {
            if(Character.isDigit(str.charAt(i)))
            {
   				num=num+str.charAt(i);
            }
            else
            {
    			if(!num.equals(""))
			    {
				  sum=sum+Integer.parseInt(num);
				  num="";
			    }
			 }
		}      
       System.out.println(sum);
   }
}
*/
