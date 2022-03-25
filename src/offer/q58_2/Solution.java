package offer.q58_2;

/**
 * @author HP
 * @date 2022/3/14
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {

        String s1 = s.substring(0,n);
        String s2 = s.substring(n);

        return s2+s1;
    }
}
