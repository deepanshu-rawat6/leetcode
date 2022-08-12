class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans=new int[2*n];
        int k=0,l=n-1;;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                ans[i]=nums[i-k];
                k++;
            }
            else{
                ans[i]=nums[i+l];
                l--;
            }
        }
        return ans;
    }
}