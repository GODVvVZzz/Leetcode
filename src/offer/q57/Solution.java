package offer.q57;

/**
 * @author HP
 * @date 2022/3/24
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int p = 0, q = nums.length - 1;
        while (p < q){
            int temp = nums[p] + nums[q];

            if (temp < target ){
                p++;
            } else if(temp > target){
                q--;
            }
            else {
                return  new int[]{nums[p],nums[q]};
            }
        }

        return new int[0];
    }
}
