class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int temp = x;
        int rev=0;
        while (x>0){
            int rem = x%10;
            rev = 10*rev+rem;
            x = x/10;
        }
        if (rev==temp){
            return true;
        }else{
            return false;
        }
        
    }
}