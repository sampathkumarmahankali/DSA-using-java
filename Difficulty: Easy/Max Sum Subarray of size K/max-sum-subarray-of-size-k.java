// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int max=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(k==n)return sum;
        max=sum;
        int x=0;
        for(int i=k;i<n;i++){
            sum+=arr[i];
            sum-=arr[x];
            x++;
            max=Math.max(max,sum);
        }
        return max;
    }
}