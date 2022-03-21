//LCM of Three Numbers

package lcm;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3, b = 6, c = 9, lcm;		

		lcm = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		while(lcm % a != 0 || lcm % b != 0 || lcm % c != 0)
		{
			lcm++;
		}
		
		System.out.println("LCM is: " + lcm);
	}

}
