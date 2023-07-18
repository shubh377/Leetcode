//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer> list=new ArrayList<>();
        // your code here
        int n=pat.length();
        int m=txt.length();
        
        int[] lps=new int[n];
        computeLps(lps,pat,n);
        
        int i=0;
        int j=0;
        
        while (i<m){
            
            if (pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            
            if (j==n){
                list.add(i-j+1);
                j=lps[j-1];
            }
            
            else if (i<m && pat.charAt(j)!=txt.charAt(i)){
                
                if (j==0){
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
            
            
        }
        return list;
        
    }
    
    public static void computeLps(int[] lps,String pat, int n){
        
        int j=1;
        int i=0;
        lps[0]=0;
        
        while (j<n){
            
            if (pat.charAt(j)==pat.charAt(i)){
                i++;
                lps[j]=i;
                j++;
            }
            else{
                if (i==0){
                    
                    lps[j]=0;
                    j++;
                    
                }
                else{
                    i=lps[i-1];
                }
            }
        }
    }
}