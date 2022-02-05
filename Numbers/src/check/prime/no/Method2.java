package check.prime.no;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7, temp = 0;
		for(int i = 2; i <= num - 1; i++) {
			if(num % i == 0) {
				temp = temp + 1;			//temp++ 	//if here we write not prime no, then it prints again and again
			}
		}
		if(temp == 0)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
