class Solution {
    public int maxPower(String s) {
        int count=1,ans=1;
        char c=s.charAt(0);
        for(int i=1;i<s.length();i++){
            char temp=s.charAt(i);
            if(c!=temp){
                c=temp;
                count=1;
            }else{
                count++;
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}