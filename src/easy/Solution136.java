package easy;
/**
 *
 * Leet code problem number: 136
 * Problem name: Single Number
 * Problem type: Array
 * Difficulty: Medium
 * Runtime: 0ms
 * Memory Usage: 40 MB
 */

public class Solution136 {
    static int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] n = {1, 1, 2, 2, 3, 3, 5};
        System.out.println(singleNumber(n));

    }
}
