class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;

        int target = (n + 1) / 2;
        int count = 1;
        int i = 0;
        int j = 0;
        double median = 0;
        while (i < nums1.length && j < nums2.length) {

            if (count == target) {
                if (nums1[i] < nums2[j]) {
                    median += nums1[i];
                    i++;
                }else {
                    median += nums2[j];
                    j++;
                }
                if (n % 2 != 0) { // odd, so return median
                    return median;
                }else {
                    if (count == (n + 1) / 2 + 1) {
                        return median / 2;
                    }
                    target++;
                }
            }else {
                if (nums1[i] < nums2[j]) {
                    i++;
                }else {
                    j++;
                }
            }
            
            count++;
        }

        //answer either returned or one array is empty. So, iterate in other array

        if (i == nums1.length) { //iterate in array j
            while (j < nums2.length) {
                if (count == target) {
                    median += nums2[j];
                    if (n % 2 != 0) { // odd, so return median
                        return median;
                    }else {
                        if (count == (n + 1) / 2 + 1) {
                            return median / 2;
                        }
                        target++;
                    }
                }
                count++;
                j++;
            }
        }else { //iterate in array i
            while (i < nums1.length) {
                if (count == target) {
                    median += nums1[i];
                    if (n % 2 != 0) { // odd, so return median
                        return median;
                    }else {
                        if (count == (n + 1) / 2 + 1) {
                            return median / 2;
                        }
                        target++;
                    }
                }
                count++;
                i++;
            }
        }

        return median;
    }
}