class Solution {
    public int commonFactors(int a, int b) {
        int lim = gcd(a , b);
        int c = 1;
        for(int i = 2;i <= lim;i++){
            if (a % i == 0 && b % i == 0){
                c++;
            }
        }
        return c;
    }
    public int gcd(int x,int y){
        if(x == 0) return y;
        return gcd(y % x, x);
    }
}