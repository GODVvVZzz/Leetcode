package offer.q53_1;

/**
 * @author HP
 * @date 2022/3/14
 */
public class Solution {
    public int search(int[] nums, int target) {

        int t1 = binary_search(nums, target);

        if(t1 == -1){
            return 0;
        }

        int t2 = t1 - 1;
        int count = 0;


        while (nums[t1] == target){
            count ++;
            t1 ++;
            if(t1 == nums.length){
                break;
            }
        }


        if(t2 >= 0){

            while (nums[t2] == target){
                count ++;
                t2 --;
                if(t2 < 0){
                    break;
                }
            }

        }


        return count;
    }

    public int binary_search(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
