class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > k) {
            int n = sb.length();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int sum = 0;
                int j = i;
                for (; j < (k+i) && j < n; j++) {
                    sum += sb.charAt(j) - '0';
                }
                i = j - 1;
                temp.append(sum);
            }
            sb = new StringBuilder(temp);
        }
        return sb.toString();  
    }
}