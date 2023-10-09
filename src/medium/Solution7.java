package medium;

/**
 *
 * Leet code problem number: 7
 * Problem name: Reverse Integer
 * Problem type: Array
 * Difficulty: Medium
 * Runtime: 0ms
 * Memory Usage: 39 MB
 */
public class Solution7 {
    static int reverse(int x) {
        int n = 0;
        while (x != 0) {
            int rem = x % 10;
            x /= 10;
            if (n > Integer.MAX_VALUE / 10 || n < Integer.MIN_VALUE / 10) {
                return 0;
            }
            n = (n * 10) + rem;
        }
        return n;
    }

    public static void main(String[] args) {
        int n = -123;
        System.out.println(reverse(n));
    }
}
