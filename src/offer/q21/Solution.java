package offer.q21;

/**
 * @author HP
 * @date 2022/3/24
 */
public class Solution {
    public static int[] exchange(int[] nums) {

        int p = 0, q = nums.length - 1;
        while(p < q){
            while (nums[p] % 2 == 1 && p < q){
                p++;
            }
            while (nums[q] % 2 == 0 && p < q){
                q--;
            }
            swap(nums,p,q);
        }

        return nums;
    }

    public static void swap(int[] nums, int p, int q) {
        int temp = 0;
        temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}
