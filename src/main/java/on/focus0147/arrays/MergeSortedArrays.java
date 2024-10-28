package on.focus0147.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    /**
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     *
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n,
     * where the first m elements denote the elements that should be merged,
     * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     * @param args
     */
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
//        System.out.println(
//                Arrays.toString(
//                        mergeSort(nums1, nums1.length-nums2.length, nums2, nums2.length)));

        System.out.println(
                Arrays.toString(
                        merge(nums1, nums1.length-nums2.length, nums2, nums2.length)));
    }

    /**
     * O((l1+l2) log(l1+l2)) из-за sort
     */
    public static int[] mergeSort(int[] nums1, int l1, int[] nums2, int l2) {

        for (int i1 = l1, i2 = 0; i1< l1 + l2; i1++, i2++) {
            nums1[i1] = nums2[i2];
        }
        Arrays.sort(nums1);
        return nums1;
    }

    /**
     * За заход перемещаем по одному значению.
     * Если значение переместили - индекс уменьшили.
     * O(n+m) - так как в цикле и доп цикле суммарно проходим каждый элемент
     */
    public static int[] merge(int[] nums1, int l1, int[] nums2, int l2) {
        int i = l1 - 1, j = l2 - 1, k = l1 + l2 - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        return nums1;
    }
}
