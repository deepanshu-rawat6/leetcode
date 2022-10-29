class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        for (int i = len - 1 ; i >= 0 ; --i) {
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch) ) {
                return len - 1 - i;
            }else if ( i == 0) {
                return len;
            }
        }
        return 1;
    }
}