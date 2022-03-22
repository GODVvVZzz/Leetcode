package offer.q42;

/**
 * @author HP
 * @date 2022/3/19
 */
public class Solution {
    public int maxSubArray(int[] nums) {

        int size = nums.length + 1;
        int[] dp = new int[size];
        dp[0] = 0;

        for (int i = 0; i < nums.length ; i++) {
            if(dp[i] <= 0){
                dp[i+1] = nums[i];
            }else {
                dp[i+1] = nums[i] + dp[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < dp.length; i++) {
            if(dp[i] > max){
                max = dp[i];
            }
        }

        return max;
    }
}
