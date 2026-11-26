class Solution {
    public boolean canAliceWin(int n) {
        int count = 10;
        boolean alice = true;
        while (count > 1) {
            if (count == 0) {
                return !alice;
            }
            if (n >= count) {
                n -= count;
                count--;
                alice = !alice;
            }else {
                return !alice;
            }
        }
        return true;
    }
}