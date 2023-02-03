import java.util.ArrayList;

class Solution {
    public int maximum69Number (int num) {
        int x = num;
        ArrayList<Integer> list = new ArrayList<>();
        while (x > 0) {
            int t = x % 10;
            list.add(t);
            x /= 10;
        }
        int n = list.size();
        for (int i = n - 1; i >= 0 ; i--) {
            if (list.get(i) == 6) {
                list.set(i,9);
                break;
            }
        }
        int ans = 0;
        for (int i = n - 1 ; i >= 0 ; i--) {
            ans = 10 * ans + list.get(i);
        }
        return ans;
    }
}