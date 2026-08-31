class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        String Sub_String = "" + s.charAt(0);
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Sub_String.indexOf(ch) == -1) {
                Sub_String += ch;
            } else {
                int index = Sub_String.indexOf(ch);
                Sub_String = Sub_String.substring(index + 1) + ch;
            }

            max = Math.max(max, Sub_String.length());
        }

        return max;
    }
}