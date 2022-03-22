package offer.q11;

/**
 * @author HP
 * @date 2022/3/15
 * 没怎么搞懂
 */
public class Solution {

    public int minArray(int[] numbers) {

        int i = 0, j = numbers.length - 1, m;

        while(i < j){
            m = i + (j - i)/2;
            if(numbers[m] > numbers[j]){
                i = m + 1;
            }else if(numbers[m] < numbers[j]){
                j = m;
            }else {
                j --;
            }
        }

        return numbers[i];
    }
}
