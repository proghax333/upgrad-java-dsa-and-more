class Solution {
    private Map<String, Integer> memo = new HashMap<>();
    private static final int MOD = 1_000_000_007;

    public int numRollsToTarget(int n, int k, int target) {
        String key = n + "," + target;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (n == 0) {
            return 0;
        }

        if (target < n) {
            return 0;
        }

        if (n == 1) {
            if (target <= k) {
                return 1;
            } else {
                return 0;
            }
        }

        int total = 0;

        for (int i = 1; i <= k; ++i) {
            if (target - i >= 0) {
                total = (total + numRollsToTarget(n - 1, k, target - i)) % MOD;
            }
        }

        memo.put(key, total);
        return total;
    }
}