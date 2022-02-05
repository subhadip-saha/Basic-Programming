//Prime Number Program using Method in Java

package check.prime.no;

public class Method7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  checkPrime(0);
		  checkPrime(1);  
		  checkPrime(3);  
		  checkPrime(17);  
		  checkPrime(20); 

	}
	
	static void checkPrime(int num){  
		  int flag = 0;      
      
		  if(num == 0 || num == 1){  
		   System.out.println(num + " is not prime number");      
		  }else{  
		   for(int i = 2; i <= num/2; i++){      
		    if(num % i == 0){      
		     System.out.println(num + " is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag == 0)  
		   { 
			   System.out.println(num + " is prime number"); 
		   }  
		  }//end of else  
		}  

}
