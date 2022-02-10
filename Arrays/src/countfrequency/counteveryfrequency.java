//to find the frequency of all elements in an array 
package countfrequency;

public class counteveryfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[]{1,5,2,1,6,5,4,1};
		
		int[] visitedArr = new int[arr.length];	
		
		//it will check whether the element of above array is visited or not
		int visited = -1;
			
		
		for(int i = 0; i < arr.length; i++)
		{		
			int count = 1;				//initially count of each element is 1
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					visitedArr[j] = visited;
				}
			}
			
			if(visitedArr[i] != visited)
			{
				visitedArr[i] = count;
			}
		}
		
		for(int i = 0; i < visitedArr.length; i++)
		{
			if(visitedArr[i] != visited)
			{
				System.out.println("Frequency of " + arr[i] + " is: " +visitedArr[i]);
			}
		}
	}

}
