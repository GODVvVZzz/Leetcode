package offer.q26;

import com.sun.source.tree.Tree;
import offer.q32_1.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author HP
 * @date 2022/3/16
 */
public class Solution {

    public boolean isSubStructure(TreeNode A, TreeNode B) {

        return ((A != null)&&(B != null)) && (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }

    public boolean recur(TreeNode A, TreeNode B){

        if(B == null){
            return true;
        }
        if(A == null ){
            return false;
        }

        if(A.val != B.val){
            return false;
        }

        return recur(A.left,B.left)&&recur(A.right,B.right);
    }
}
