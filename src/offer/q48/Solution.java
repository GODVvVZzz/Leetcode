package offer.q48;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HP
 * @date 2022/3/21
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {

        Map<Character,Integer> map = new HashMap<>();
        int res = 0,temp = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = map.getOrDefault(s.charAt(i), -1);
            map.put(s.charAt(i), i);

            temp = temp < i - index ? temp + 1 : i - index;

            res = Math.max(res,temp);
        }

        return res;
    }
}
