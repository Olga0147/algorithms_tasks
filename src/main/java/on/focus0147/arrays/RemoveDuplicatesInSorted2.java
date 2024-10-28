package on.focus0147.arrays;

import java.util.Arrays;

public class RemoveDuplicatesInSorted2 {

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * remove some duplicates in-place such that each unique element appears at most twice.
     * The relative order of the elements should be kept the same.
     */
    public static void main(String[] args){
        int[] nums1 = {0,0,1,1,1,1,2,3,3};

        //System.out.println(removeElement1(nums1));
        System.out.println(removeElement2(nums1));
    }

    /**
     * O(n)
     */
    public static int removeElement1(int[] nums) {
        int index = 0;
        boolean duplicates = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]){
                nums[++index] = nums[i];
                duplicates = false;
            } else if(nums[i] == nums[index] && !duplicates){
                nums[++index] = nums[i];
                duplicates = true;
            }
        }

        //Стирать у nums хвост не надо по условию задачи
        System.out.println(Arrays.toString(nums));
        return ++index;
    }

    public static int removeElement2(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }

        int j = 2;
        for(int i=2; i<n; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }

        //Стирать у nums хвост не надо по условию задачи
        System.out.println(Arrays.toString(nums));
        return j;
    }

}
