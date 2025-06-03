// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int prd=1;
        int x=-1;
        int j=-1;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && x==-1){
                x=0;
                j=i;
            }
            if(arr[i]==0)c++;
            if(arr[i]!=0)
            prd*=arr[i];
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]!=0)
        arr[i]=prd/arr[i];
        if(arr[i]==0)arr[i]=prd;
        if(x==0 && i!=j)arr[i]=0;
        if(c>1)arr[i]=0;
        }
        
        return arr;
    }
}
