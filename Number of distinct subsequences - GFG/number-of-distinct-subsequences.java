//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int distinctSubsequences(String S) {
        // code here
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int dp[]=new int[S.length()+1];
        dp[0]=1;
        int mod=1000000007;
        for(int i=1;i<S.length()+1;i++){
             dp[i]=(2*dp[i-1])%mod;
           char ch=S.charAt(i-1);
           if(map.containsKey(ch)){
               dp[i]=(dp[i]-dp[map.get(ch)-1]+mod)%mod;
           }
           map.put(ch,i);
        }
        return dp[S.length()];
        
    }
  
}