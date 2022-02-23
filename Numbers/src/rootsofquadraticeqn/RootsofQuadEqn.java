//Java Program to Find all Roots of a Quadratic Equation

//for any quadratic equation like: ax^2 + bx + c = 0 

//The discriminant is the part of the quadratic formula underneath the square root symbol: b²-4ac. 
//The discriminant tells us whether there are two solutions, one solution, or no solutions.


package rootsofquadraticeqn;

public class RootsofQuadEqn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // value a, b, and c
	    double a = 2.3, b = 4, c = 5.6;
	    double root1, root2;

	    // calculate the discriminant (b2 - 4ac)
	    double determinant = (b * b) - (4 * a * c);

	    //A positive discriminant indicates that the quadratic has two distinct real number solutions.
	    // check if discriminant is greater than 0
	    if (determinant > 0) {

	      // two real and distinct roots
	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

	      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	    }

	    //A discriminant of zero indicates that the quadratic has a repeated real number solution.
	    // check if discriminant is equal to 0
	    else if (determinant == 0) {

	      // two real and equal roots
	      // discriminant is equal to 0
	      // so -b + 0 == -b
	      root1 = root2 = -b / (2 * a);
	      System.out.format("root1 = root2 = %.2f;", root1);
	    }

	    //A negative discriminant indicates that neither of the solutions are real numbers.
	    // if discriminant is less than zero
	    else {

	      // roots are complex number and distinct
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.format("root1 = %.2f + %.2fi", real, imaginary);
	      System.out.format("\nroot2 = %.2f - %.2fi", real, imaginary);
	    }
	  }

}
