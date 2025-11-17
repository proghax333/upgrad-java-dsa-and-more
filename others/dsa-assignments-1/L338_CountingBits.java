class Solution {
    public int[] countBits(int n) {
        int mask = 0b11111111;
        int[] store = new int[mask + 1];

        for(int i = 0; i < store.length; ++i) {
            int c = 0;
            for(int j = 0; j < 8; ++j) {
                if((i & (1 << j)) > 0) {
                    c++;
                }
            }

            store[i] = c;
        }

        int[] shifts = { 0, 8, 16, 24 };
        int[] result = new int[n + 1];

        for(int i = 0; i <= n; ++i) {
            int count =
                    store[(i >> 0) & mask]
                            + store[(i >> 8) & mask]
                            + store[(i >> 16) & mask]
                            + store[(i >> 24) & mask];

            result[i] = count;
        }

        return result;
    }
}