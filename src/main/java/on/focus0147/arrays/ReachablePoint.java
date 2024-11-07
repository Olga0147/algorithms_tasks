package on.focus0147.arrays;

public class ReachablePoint {

    /**
     * Значение - на солько индексов вперед максиму можно прыгнуть.
     * Нужно проверить, достигается ли конечная точка.
     *
     * Идея : каждая предыдущая точка должна быть достижима ( не важно, из какой именно точки)
     */
    public static void main(String[] args){
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int maxLength = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(--maxLength<0){
                return false;
            }
            maxLength = Math.max(maxLength, nums[i]);

        }
        return true;
    }

}
