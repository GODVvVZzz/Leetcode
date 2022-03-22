package offer.q46;

/**
 * @author HP
 * @date 2022/3/21
 */
public class Solution {

    public int translateNum(int num) {

/*        Integer new_num = num;
        String str = new_num.toString();*/

        String str = String.valueOf(num);

        if(str.length() == 1){
            return 1;
        }

        int[] nums = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            nums[i] = Integer.parseInt(ch.toString());
        }

/*        int[] dp = new int[str.length()];
        dp[0] = 1;
        int temp = nums[0]*10 + nums[1];
        if(temp > 25){
            dp[1] = 1;
        }else {
            dp[1] = 2;
        }

        for (int i = 2; i < dp.length; i++) {
            if(nums[i-1] * 10 + nums[i] > 25 || nums[i-1] * 10 + nums[i] < 10){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[dp.length - 1];*/
        int a = 1, b = 1;
        for (int i = 1; i < nums.length; i++) {
           int c = nums[i-1] * 10 + nums[i] <= 25 && nums[i-1] * 10 + nums[i] >= 10 ?
                   a + b : b;
           a = b;
           b = c;
        }

        return b;
    }

}
