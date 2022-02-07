/*
 * If the element of an array is repeated then this approach won’t work because we always pick
 * the first index for second smallest which will be wrong for the repeatede elements.
 */


package nthsmallestandlargest;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 4, 6, 7, 5};
		int small = Integer.MAX_VALUE;
		small = Math.min(small,arr[0]);
		System.out.println(small);
		int large = Integer.MIN_VALUE;
		
		System.out.println(large);

	}

}
