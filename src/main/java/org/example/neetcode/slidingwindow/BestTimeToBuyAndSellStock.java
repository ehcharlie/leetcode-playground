package org.example.neetcode.slidingwindow;

public class BestTimeToBuyAndSellStock {

    public static int example(int[] prices) {
        int left = 0;
        int right = 1;

        int maxProfit = 0;

        while (right <= prices.length) {
            if (prices[left] < prices[right]) {
                int temp = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, temp);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }

}