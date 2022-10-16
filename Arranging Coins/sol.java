class Solution {
    public int arrangeCoins(int n) {
        long s = 0, e = n;
        long i, val;
        while(s <= e){
            i = s + (e - s) / 2;
            val = i * (i + 1) / 2;
            
            if (val == n) return (int)i;
            
            if(n < val){
                e = i - 1;
            }else{
                s = i + 1;
            }
        }
        return (int)e;
    }
}