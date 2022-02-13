//Program for Mean and median of an unsorted array


package meanmedian;

import java.util.*;

public class Method1 {

    // Function for calculating mean
    public static double findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
 
        double mean = (double)sum/(double)n;
        return mean;
       // return (double)sum / (double)n;
    }
 
    // Function for calculating median
    public static double findMedian(int arr[], int n)
    {
        // First we sort the array
        Arrays.sort(arr);
        
        // check for even case
        
        if(n % 2 == 0)
        {
        	int ind1 = (n / 2) - 1;
        	int ind2 = (n / 2);
        	double median = (double)(arr[ind1] + arr[ind2]) / 2.0;
        	return median;
        }
        else
        {
        	int ind = (n / 2);
        	double median = arr[ind];
        	return median;
        }
       /* 
        * if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
        */
    }
	// Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] ={ 1, 3, 4, 2, 7, 5, 8, 6 };
        int n = arr.length;
       
        // Function call
        System.out.println("Mean = " + findMean(arr, n));
        System.out.println("Median = " + findMedian(arr, n));
	}

}
