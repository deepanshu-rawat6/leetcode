class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int i=0,k=n;
        if(n%2!=0){
            ans[n/2]=0;
        }
        while(i<n/2){
            ans[i]=-k;
            ans[n-i-1]=k;
            k--;
            i++;
        }
        return ans;
    }
}