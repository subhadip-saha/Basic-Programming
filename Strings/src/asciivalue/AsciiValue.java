package asciivalue;

public class AsciiValue {

	public static void value() {
		char ch = 'e';
		int ascii = ch;
		
        // we can also cast char to int, although we don't need
        int castAscii = (int) ch;
        
		System.out.println("The ASCII value of e is: " + ascii);
		System.out.println("The ASCII value of e is: " + castAscii);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		value();
	}

}
