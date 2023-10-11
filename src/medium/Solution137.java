package medium;
/**
 *
 * Leet code problem number: 137
 * Problem name: Single Number II
 * Problem type: Array
 * Difficulty: Medium
 * Runtime: 0ms
 * Memory Usage: 40 MB
 */

public class Solution137 {
    static int singleNumber(int[] nums) {
        int n1=0;
        int n2 =0;
        for (int num : nums) {
            n1 = (n1 ^ num) & (~n2);
            n2 = (n2 ^ num) & (~n1);
        }
        return n1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(singleNumber(arr));
    }
}
