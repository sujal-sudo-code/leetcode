class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int l = 0, r = word.length() - 1;

            while (l < r && word.charAt(l) == word.charAt(r)) {
                l++;
                r--;
            }

            if (l >= r) return word;
        }

        return "";
    }
}