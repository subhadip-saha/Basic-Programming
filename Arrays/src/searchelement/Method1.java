//Search an element in an array and return its position

package searchelement;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,12,26,38,92};
		int key = 26;
		int position = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
			{
				index = i;
				position = i + 1;
				break;
			}
		}
		System.out.println("The element is present in "+ index +" index");
		System.out.println("The element is present at position: "+ position);
	}

}
