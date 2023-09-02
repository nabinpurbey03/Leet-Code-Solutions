/**
 *
 * Leet code problem number: 217
 * Problem name: Contains Duplicate
 * Problem type: Array
 * Difficulty: Easy
 * Runtime: 8ms
 * Memory Usage: 55.6 MB
 */


import java.util.HashSet;

public class Solution217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
        arr = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(arr));
        arr = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(arr));
    }
}
