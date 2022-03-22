package offer.q50;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HP
 * @date 2022/3/15
 */
public class Solution {

    public char firstUniqChar(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i < s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }

        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }

/*        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                return m.getKey();
            }
        }*/

        return ' ';

    }
}
