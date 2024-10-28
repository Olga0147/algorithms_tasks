package on.focus0147.arrays;

import java.util.Arrays;

public class RemoveDuplicatesInSorted {

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     */
    public static void main(String[] args){
        int[] nums1 = {1,1,2};

        System.out.println(removeElement1(nums1));
        //System.out.println(removeElement2(nums1));
    }

    /**
     * O(n)
     */
    public static int removeElement1(int[] nums) {
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]){
                nums[++index] = nums[i];
            }
        }

        //Стирать у nums хвост не надо по условию задачи
        System.out.println(Arrays.toString(nums));
        return ++index;
    }

    public static int removeElement2(int[] nums) {
        int index = 0;
        int val = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val){
                nums[++index] = nums[i];
                val = nums[i];
            }
        }

        //Стирать у nums хвост не надо по условию задачи
        System.out.println(Arrays.toString(nums));
        return ++index;
    }

}
