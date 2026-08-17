/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int maxIndex = findPeakElement(mountainArr);
        if (mountainArr.get(maxIndex) == target) {
            return maxIndex;
        }
        int ans = binarySearch(mountainArr, target, 0, maxIndex - 1 ,true);
        if (ans != -1) {
            return ans;
        }
        ans = binarySearch(mountainArr, target, maxIndex + 1, mountainArr.length() - 1,false);
        return ans;

        
    }
    public int findPeakElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                //ascending side of the array
                start = mid + 1;
            }else {
                //descending side of the array and mid can be the possible ans
                end = mid;
            }
        }
        return end;
    }

    public int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAsc) {
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (mountainArr.get(mid) == target) {
                return mid;
            }
            if (isAsc) {
                if (mountainArr.get(mid) < target) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if (mountainArr.get(mid) > target) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}