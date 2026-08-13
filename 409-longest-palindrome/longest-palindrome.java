class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int ans = 0;
        boolean odd = false;

        for (char c : s.toCharArray()) count[c]++;

        for (int n : count) {
            ans += n / 2 * 2;
            if (n % 2 == 1) odd = true;
        }

        if (odd) ans++;

        return ans;
    }
}