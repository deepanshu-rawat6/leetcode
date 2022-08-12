import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> caldigits(int n){
        ArrayList<Integer> list=new ArrayList<Integer>(1);
        while(n!=0){
            int r=n%10;
            n/=10;
            list.add(r);
        }
        return list;
    }
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> list=caldigits(n);
        int prod=1,sum=0;
        for(int i:list){
            prod*=i;
            sum+=i;
            System.out.println(i);
        }
        return (prod-sum);
    }
}