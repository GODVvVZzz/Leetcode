package offer.q53_2;

/**
 * @author HP
 * @date 2022/3/14
 */
public class Solution {

    public int missingNumber(int[] nums) {

        int left = 0;
        int right = nums.length;
        int mid;

        while(left <= right){
            mid = (right + left)/2;
            if(nums[mid] == mid){
                left = mid + 1;
            }else{
                right = right - 1;
            }
        }
        return left;
    }
}
