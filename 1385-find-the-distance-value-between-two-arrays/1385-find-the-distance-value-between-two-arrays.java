class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (binarySearch(arr2, arr1[i], d)) continue;
            count++;
        }
        return count;
    }
    boolean binarySearch(int[] array, int target, int d) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return true;
            }else if (array[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        if (end != -1 && Math.abs(array[end] - target) <= d) return true;
        if (start != array.length && Math.abs(array[start] - target) <= d) return true;
        return false;
    }
}