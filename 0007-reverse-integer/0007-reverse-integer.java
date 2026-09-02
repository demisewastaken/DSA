class Solution {
    public int reverse(int x) {
        StringBuilder ans = new StringBuilder();
        long num = x;

        if (x < 0) {
            ans.append("-");
        }else if (x==0){
            return 0;
        }

        num = Math.abs(num);

        while (num > 0) {
            long rem = num % 10;
            ans.append(rem);
            num /= 10;
        }

        long val = Long.parseLong(ans.toString());

        if (val < Integer.MIN_VALUE || val > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) val;
    }
}