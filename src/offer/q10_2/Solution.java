package offer.q10_2;

/**
 * @author HP
 * @date 2022/3/17
 */
public class Solution {
    public int numWays(int n) {

        int p = 1, q = 1, sum = 1;
        for (int i = 1; i < n ; i++) {
            sum = (p + q) % 1000000007;
            p = q;
            q = sum;
        }

        return sum;
    }
}
