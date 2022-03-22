package offer.q03;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author HP
 * @date 2022/3/6
 */
public class findRepeatNumber {

    public static int findRepeatNumber(int[] nums) {
       /* for (int i = 0; i < nums.length; i++) {
            for (int a = i + 1; a < nums.length; a++) {
                if (nums[i] == nums[a]) {
                    return nums[i];
                }
            }

        }
        return -1;*/

        /*HashSet set = new HashSet();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;*/

        //限制条件 时间复杂度O(n) 空间复杂度O(1)
        for(int i=0; i < nums.length; i ++){

            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                swap(nums,i,nums[i]);
            }
        }
        return -1;
    }

    public static void swap(int[] nums,int i, int j){
        int t;
        t=nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
