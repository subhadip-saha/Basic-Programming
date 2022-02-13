package sumofnumbers;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String text = "abcd45efg46esf10";
		 String number = "";
		 int sum = 0;
		  
		  for(int i = 0; i < text.length(); i++) 
		  {
			   if(Character.isDigit(text.charAt(i))) 
			   {
			    number = number + text.charAt(i);
			    
			   } 
			   else 
			   {
				    if(number != "") 
				    {
				     sum = sum + Integer.valueOf(number);
				     number = "";
				    }    
			   }
		   
		   if(i == text.length()-1 && number != "" ) 
		   {
		    sum = sum + Integer.valueOf(number);
		   }
		 }
		  System.out.println("Sum : " + sum);
		 
	}

}
