class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] isolated = new int[n + 1][2];
        for (int i = 0; i < trust.length; i++) {
            isolated[trust[i][1]][0]++;
            isolated[trust[i][0]][1] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (isolated[i][0] == n - 1 && isolated[i][1] == 0) {
                return i;
            }
        }
        return -1;
    }
}