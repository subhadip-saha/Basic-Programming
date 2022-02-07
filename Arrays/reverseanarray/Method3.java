//Java Program to Reverse an Array
//using two pointers approach and swapping

package reverseanarray;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] arr = {1, 7, 8, 9};
        reverse(arr);

        System.out.println("After reversing the given array ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

	}
	
	  public static void reverse(int[] arr) 
	  {
          //Declare two variables start and end
          int i = 0;							//for starting index
          int j = arr.length - 1;					////for ending index
      
         //Run a loop while start is less than end, 
          //and then swap the element at ith index to jth index and vice versa
          while(i < j) 
          {
  
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
 
              i++;
              j--;
          }
	  }

}
