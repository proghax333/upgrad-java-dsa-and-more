class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        if(n == 2) return 2;
        if(n == 3) return 3;

        int p1 = 3;
        int p2 = 2;
        int cur = 0;

        for(int i = 4; i <= n; ++i) {
            cur = p1 + p2;
            p2 = p1;
            p1 = cur;
        }

        return cur;
    }
}