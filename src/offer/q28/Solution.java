package offer.q28;

import offer.q32_1.TreeNode;

/**
 * @author HP
 * @date 2022/3/17
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {

        return root == null ? true : recur(root.left, root.right);

    }

    public boolean recur(TreeNode A, TreeNode B){

        if(A == null && B == null){
            return true;
        }

        if(A == null || B == null || A.val != B.val){
            return false;
        }

        return recur(A.left,B.right)&&recur(A.right,B.left);
    }
}
