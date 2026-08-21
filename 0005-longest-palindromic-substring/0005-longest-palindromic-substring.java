class Solution {
    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        int i = 0;
        int j = 1;

        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(i));

        while (i < s.length() - 1) {
            sb.append(s.charAt(j));
            if (s.charAt(i) == s.charAt(j)) {
                boolean palindrome = isPalindrome(sb.toString());
                if (palindrome && ans.length() < sb.length()) {
                    ans = new StringBuilder(sb);
                }
            }

            j++;
            if (j == s.length()) {
                i++;
                sb = new StringBuilder();
                sb.append(s.charAt(i));
                j = i + 1;
            }
        }

        return ans.toString();
    }

    boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}