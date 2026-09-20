class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            total += (122 - (int)temp + 1) * (i + 1);
        }
        return total;
    }
}