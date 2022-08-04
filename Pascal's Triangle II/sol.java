class Solution {
    public List<Integer> getRow(int row) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int n1=row,n2=1;
        ans.add(1);
        long res=1;
        for(int i=1;i<=row;n1--,n2++,i++){
            res=res*n1/n2;
            ans.add((int)res);
        }
        return ans;
    }
}