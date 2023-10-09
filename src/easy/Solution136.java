package easy;

import java.util.Arrays;

public class Solution136 {
    static int singleNumber(int[] nums) {
        int ans = 0; //since XOR with 0 returns same number
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1,1,2,2,3,3,5};
        System.out.println(singleNumber(n));

    }
}
