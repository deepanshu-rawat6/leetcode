class Solution {
    int[] fibo=new int[35];
    public int fib(int n) {
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<35;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        return fibo[n];
    }
}