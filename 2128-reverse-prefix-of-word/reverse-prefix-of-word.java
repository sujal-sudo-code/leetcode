class Solution {
    public String reversePrefix(String word, char ch) {
        char[] a = word.toCharArray();
        int r = word.indexOf(ch);

        if (r == -1) return word;

        int l = 0;

        while (l < r) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }

        return new String(a);
    }
}