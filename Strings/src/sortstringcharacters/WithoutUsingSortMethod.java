package sortstringcharacters;

public class WithoutUsingSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str =  "edcba";
		char temp;
		char carr[] = str.toCharArray();
		
		for(int i = 0; i < carr.length; i++)
		{
			for(int j = i + 1; j < carr.length; j++)
			{
				if(carr[i] > carr[j])
				{
					temp = carr[i];
					carr[i] = carr[j];
					carr[j] = temp;					
				}
			}
		}
		
		System.out.println("Sorted string: " + new String(carr));
	}

}
