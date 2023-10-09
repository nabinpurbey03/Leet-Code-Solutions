package easy;

/**
 *
 * Leet code problem number: 121
 * Problem name: Best Time to Buy and Sell Stock
 * Problem type: Array
 * Difficulty: Easy
 * Runtime: 2ms
 * Memory Usage: 40 MB
 */

public class Solution121 {
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0;
        for (int price : prices) {
            buy = Math.min(buy, price);
            sell = Math.max(sell, price - buy);
        }
        return sell;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}
