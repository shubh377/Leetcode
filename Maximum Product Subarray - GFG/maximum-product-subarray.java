//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maxeh=arr[0];
        long mineh=arr[0];
        long max=arr[0];
        
        for (int i=1;i<n;i++){
            
            long temp=Math.max(arr[i],Math.max(maxeh*arr[i],mineh*arr[i]));
            mineh=Math.min(arr[i],Math.min(mineh*arr[i],maxeh*arr[i]));
            maxeh=temp;
            max=Math.max(maxeh,max);
        }
        
        return max;
    }
}