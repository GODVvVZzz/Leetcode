package offer.q10_1;

/**
 * @author HP
 * @date 2022/3/17
 */
public class Solution {
    public int fib(int n) {

        if(n < 2){
            return n;
        }

        int mod = 1000000007;
        int p = 0, q = 0, r = 1;
        for (int i = 1; i < n; i++) {
            p = q;
            q = r;
            r = (p + q)%mod;
        }

        return r;
    }
}
