class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= a.length; i++) {
            if (i == a.length || a[i] == ' ') {
                int l = start, r = i - 1;

                while (l < r) {
                    char temp = a[l];
                    a[l] = a[r];
                    a[r] = temp;
                    l++;
                    r--;
                }

                start = i + 1;
            }
        }

        return new String(a);
    }
}