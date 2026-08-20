import java.util.ArrayList;

class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        int list1Index = 0;
        int list2Index = 0;

        int i = 2;

        while (i < nums.length) {
            if (list1.get(list1Index) > list2.get(list2Index)) {
                list1.add(nums[i]);
                list1Index++;
            }else {
                list2.add(nums[i]);
                list2Index++;
            }
            i++;
        }

       
        int[] result = new int[nums.length];
        i = 0;

        for (int j = 0; j < list1.size(); j++) {
            result[i] = list1.get(j);
            i++;
        }

        for (int j = 0; j < list2.size(); j++) {
            result[i] = list2.get(j);
            i++;
        }

        return result;


    }
}
