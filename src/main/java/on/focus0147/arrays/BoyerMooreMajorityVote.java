package on.focus0147.arrays;

import java.util.Arrays;

public class BoyerMooreMajorityVote {

    /**
     * Boyer–Moore majority vote algorithm
     */
    public static void main(String[] args){
        int[] nums1 = {2,2,1,1,1,2,2};

        System.out.println(majority(nums1));
    }

    /**
     * O(n)
     */
    public static int majority(int[] nums) {
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }

            majority += n == res ? 1 : -1;
        }

        return res;
    }

}
