class Solution {
    public int dayOfYear(String date) {
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int year = Integer.parseInt(date.substring(0, 4));
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] prefixSum = new int[12];
        prefixSum[0] = 31;
        for (int i = 1; i < 12; i++) {
            prefixSum[i] = prefixSum[i - 1] + days[i];
        }
        if (month == 1) {
            return day;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if (month > 2) {
                return day + prefixSum[month - 2] + 1;
            }else {
                return day + prefixSum[month - 2];
            }
        }else {
            return day + prefixSum[month - 2];
        }

    }
}