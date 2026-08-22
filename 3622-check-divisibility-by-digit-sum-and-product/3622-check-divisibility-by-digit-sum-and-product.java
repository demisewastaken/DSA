class Solution {
    public boolean checkDivisibility(int n) {
        int digitsSum = 0;
        int digitsProduct = 1;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            digitsSum += rem;
            digitsProduct *= rem;
            temp = temp / 10;
        }

        return (n % (digitsSum + digitsProduct)) == 0;
    }
}