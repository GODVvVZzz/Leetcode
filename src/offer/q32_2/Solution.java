package offer.q32_2;

import offer.q32_1.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author HP
 * @date 2022/3/15
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if(root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i > 0 ; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(temp);
        }

        return res;
    }
}
