class Solution {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        if (n == 2) return -1;

        char min = 'z', max = 'a';
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < min) min = c;
            if (c > max) max = c;
        }

        if (s.charAt(0) == min || s.charAt(n - 1) == max) return 1;
        char maxRest = 'a', minRest = 'z';
        for (int i = 1; i < n; i++) maxRest = (char) Math.max(maxRest, s.charAt(i));
        for (int i = 0; i < n - 1; i++) minRest = (char) Math.min(minRest, s.charAt(i));

        if (s.charAt(0) > maxRest && s.charAt(n - 1) < minRest) return 3;
        return 2;
    }
}