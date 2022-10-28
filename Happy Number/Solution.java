class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        if(n==1 || n==7) return true;
        else{
            sum=n;
            while(sum>9){
                sum=0;
                while(n!=0){
                    int r=n%10;
                    sum+=r*r;
                    n/=10;
                }
                if(sum==1||sum==7) return true;
                n=sum;
            }
        }
        return false;
    }
}