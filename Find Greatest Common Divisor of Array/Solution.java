class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=1001;
        for(int i:nums){
            if(max<i) max=i;
            if(min>i) min=i;
        }
        return GCD(max,min);
    }
    int GCD(int a,int b){
        if(a==0) return b;
        return GCD(b%a,a);
    }
}