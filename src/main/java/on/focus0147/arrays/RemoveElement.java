package on.focus0147.arrays;

import java.util.Arrays;

public class RemoveElement {

    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
     * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
     */
    public static void main(String[] args){
        int[] nums1 = {3,2,2,3};

        System.out.println(removeElement(nums1, 3));
    }

    /**
     * O(n)
     */
    public static int removeElement(int[] nums, int val) {
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[current] = nums[i];
                current++;
            }
        }

        //Стирать у nums хвост не надо по условию задачи
        System.out.println(Arrays.toString(nums));
        return current;
    }

}
