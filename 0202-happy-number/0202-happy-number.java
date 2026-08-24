class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        
        do {
            fast = squareDigits(squareDigits(fast));
            slow = squareDigits(slow);

            if (fast == 1) {
                return true;
            }
        }while (fast != slow);
        return false;
    }
    int squareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem;
            n = n / 10;
        }
        return sum;
    }
}