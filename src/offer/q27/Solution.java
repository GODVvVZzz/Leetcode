package offer.q27;

import offer.q32_1.TreeNode;

/**
 * @author HP
 * @date 2022/3/16
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {


        if(root == null){
            return null;
        }

        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
