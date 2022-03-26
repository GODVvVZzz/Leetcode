package offer.q34;

import offer.q32_1.TreeNode;

import java.util.*;

/**
 * @author HP
 * @date 2022/3/26
 */
public class Solution {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {

        recur(root, target);
        return res;
    }

    private void recur(TreeNode root, int target) {
        if(root == null){
            return;
        }
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null){
            res.add(new LinkedList(path));
        }
        recur(root.left, target);
        recur(root.right, target);
        path.removeLast();
    }
}
