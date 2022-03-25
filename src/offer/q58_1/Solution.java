package offer.q58_1;

/**
 * @author HP
 * @date 2022/3/25
 */
public class Solution {
    public String reverseWords(String s) {

        StringBuilder res = new StringBuilder();
        s.trim();
        int i = s.length()-1, j = i;
        while (i >= 0){
            while (i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            res.append(s.substring(i+1,j+1) + " ");
            while (i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }

        return res.toString().trim();
    }
}
