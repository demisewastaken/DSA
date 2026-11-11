class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long minSum = 0;
        long diff = Math.abs(need1 - need2);

        if (costBoth <= (cost1 + cost2)) {
            minSum += (Math.max(need1, need2) - diff) * costBoth;
        }else {
            minSum += (Math.max(need1, need2) - diff) * (cost1 + cost2);
        }

        if (need1 > need2) {
            if (costBoth <= cost1) {
                minSum += diff * (costBoth);
            }else {
                minSum += diff * (cost1);
            }
        }else {
            if (costBoth <= cost2) {
                minSum += diff * (costBoth);
            }else {
                minSum += diff * (cost2);
            }
        }
        return minSum;
    }
}