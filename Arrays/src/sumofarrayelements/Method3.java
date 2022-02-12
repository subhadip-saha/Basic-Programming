//Calculate Sum of the Elements of the Array
//enhanced for loop - for-each loop

package sumofarrayelements;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  
	    int arr[] = {1,2,3,4,5};
	    int sum = 0;
	    
	    //Enhanced for loop, no index to retrieve the data from the array
	    for(int value : arr)
	    {
	    	sum = sum + value;
	    }
	    System.out.println("The sum of the elements of the array is "+sum);	
	}

}
