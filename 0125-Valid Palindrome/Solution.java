class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        char cHead;
        char cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}


//  This solution doesn't belong to me. I just saw my mistake and corrected it.
//  I didn't know that Character.isLetterOrDigit() method exists.


// Faulty Solution:

    // public static boolean isPalindrome(String s){
    //        int i = 0;
    //        int j = s.length() - 1;
    //        while (i  < j) {
    //            char ch = Character.toLowerCase(s.charAt(i));
    //            char chr = Character.toLowerCase(s.charAt(j));
    //            if (((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) && ((chr >= 'a' && chr <= 'z') || (chr >= '0' && chr <= '9')) ) {
    //                if (chr == ch) {
    //                    i ++;
    //                    j --;
    //                    continue;
    //                } else {
    //                    return false;
    //                }
    //            } else {
    //                if (!Character.isAlphabetic(ch)) {
    //                    i ++;
    //                    continue;
    //                } else if (!Character.isAlphabetic(chr)){
    //                    j --;
    //                    continue;
    //                }
    //            }
    //        }
    //        return true;
    //    }
