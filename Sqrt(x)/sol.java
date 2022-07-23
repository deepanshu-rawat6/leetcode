class Solution {
    public int mySqrt(int x) {
        long s=0,e=x;
        long root=0;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid==x) return (int)mid;
            if(mid*mid<x){
                s=mid+1;
                root=mid;
            }
            else e=mid-1;
        }
        return (int)root;
    }
}