class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=count_bits(i);
        }
        return ans;
    }
    int count_bits(int x){
        int c=0;
        while(x!=0){
            c++;
            x&=(x-1);
        }
        return c;
    }
}