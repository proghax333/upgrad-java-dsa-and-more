package org.proghax333.practice_17nov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RodCutting {
    private static class RodCuttingMemoizationSolution {
        static class CutData {
            public int answer = 0;
            public List<Integer> parts = new ArrayList<>();

            @Override
            public String toString() {
                return "CutData{" +
                        "answer=" + answer +
                        ", parts=" + parts +
                        '}';
            }
        }

        private CutData solution(int[] prices, int length, Map<Integer, CutData> dp) {
            if(length <= 0) {
                return new CutData();
            }

            if(dp.containsKey(length)) {
                return dp.get(length);
            }

            int max = Integer.MIN_VALUE;
            int left = 0, right = 0, t = 0;
            CutData sol = null;

            for(int i = 1; i <= length; ++i) {
                var s = solution(prices, length - i, dp);
                t = prices[i - 1] + s.answer;

                if(t > max) {
                    left = i;
                    right = length - i;
                    sol = s;

                    max = t;
                }
            }

            if(sol == null) {
                throw new IllegalStateException("Should not have happened. Solution must've been found.");
            }

            var cd = new CutData();
            cd.answer = max;
            cd.parts = new ArrayList<>(sol.parts);
            cd.parts.add(left);

            dp.put(length, cd);
            return cd;
        }


        public CutData solve(int[] prices, int length) {
            Map<Integer, CutData> dp = new HashMap<>();
            return solution(prices, length, dp);
        }
    }

    private static class RodCuttingTabulationSolution {
        public int solve(int[] prices, int length) {
            if(length <= 0) {
                return 0;
            }

            int[] dp = new int[length + 1];
            dp[0] = 0;

            for(int i = 1; i <= length; ++i) {

                int max = Integer.MIN_VALUE;
                for(int j = 1; j <= i; ++j) {
                    max = Math.max(max, prices[j - 1] + dp[i - j]);
                }

                dp[i] = max;
            }

            return dp[length];
        }
    }

    public static void main(String[] args) {
        int[] prices = { 0, 1, 2, 2, 2 };
        int length = 5;

        RodCuttingMemoizationSolution memoizationSolution = new RodCuttingMemoizationSolution();
        RodCuttingTabulationSolution tabulationSolution = new RodCuttingTabulationSolution();

        System.out.println("Price (memoization): " + memoizationSolution.solve(prices, length));
        System.out.println("No. of cuts: " + (memoizationSolution.solve(prices, length).parts.size() - 1));
        System.out.println("Price (tabulation): " + tabulationSolution.solve(prices, length));
    }


}
