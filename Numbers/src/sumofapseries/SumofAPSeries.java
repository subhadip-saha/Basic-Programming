package sumofapseries;

public class SumofAPSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5; 	//first term 
		int d = 5; 	//difference
		int n = 5;  //no. of terms
		int sum = 0; 
		
		for(int i = 1; i <= n; i++)
		{
			sum = sum + a;
			a = a + d;
		}
		
		System.out.println("Sum of AP Series: " + sum);
	}

}
