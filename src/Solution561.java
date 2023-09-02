/**
 *
 * Leet code problem number: 561
 * Problem name: Array pair sum
 * Problem type: Array
 * Difficulty: Easy
 * Runtime: 12ms
 * Memory Usage: 45.7 MB
 */

import java.util.Arrays;

public class Solution561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        System.out.println(arrayPairSum(arr));
        arr = new int[]{6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(arr));
    }
}
