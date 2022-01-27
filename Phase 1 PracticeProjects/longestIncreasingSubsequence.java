package PracticeProject1;


public class longestIncreasingSubsequence {



    static int max_ref; // stores the LIS
  
   
    static int lis(int arr[], int n)
    {
        // base case
        if (n == 1)
            return 1;
  
        // 'max_ending_here' is length of LIS ending with arr[n-1]
        int res, max_ending_here = 1;
  
       
        for (int i = 1; i < n; i++) {
            res = lis(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }
  
        // Compare max_ending_here with the overall max. And
        // update the overall max if needed
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
  
        // Return length of LIS ending with arr[n-1]
        return max_ending_here;
    }
  
    // The wrapper function for lis()
    static int lis1(int arr[], int n)
    {
        // The max variable holds the result
        max_ref = 1;
  
        // The function lis() stores its result in max
        lis(arr, n);
  
        // returns max
        return max_ref;
    }
  
    // driver program to test above functions
    public static void main(String args[])
    {
        int arr[] = { 1,10,50, 41,25,60 };
        int n = arr.length;
        System.out.println("Length of lis1 is "
                           + lis1(arr, n) + "\n");
    }


}
