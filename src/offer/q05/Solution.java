package offer.q05;

/**
 * @author HP
 * @date 2022/3/14
 */
public class Solution {
    public String replaceSpace(String s) {

/*        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                str.append("%20");
            }else{
                str.append(s.charAt(i));
            }
        }

        return str.toString();*/

        //双指针解法
        StringBuilder str = new StringBuilder();
            str.append(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int p = s.length() - 1;
        int q = str.length() - 1;

        while(p != q){
            char c = str.charAt(p--);
            if(c == ' '){
                str.setCharAt(q--,'0');
                str.setCharAt(q--,'2');
                str.setCharAt(q--,'%');
            }else{
                str.setCharAt(q--,c);
            }
        }

        return str.toString();
    }
}
