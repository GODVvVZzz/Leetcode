package offer.q13;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author HP
 * @date 2022/3/26
 * BFS
 */
public class Solution2 {

    public int movingCount(int m, int n, int k) {

        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Queue<int[]> queue = new LinkedList<int[]>();

        queue.add(new int[] {0, 0, 0, 0});
        while (queue.size() > 0){
            int[] x = queue.poll();
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            if(i > m-1 || j > n-1 || si+sj > k || visited[i][j]){
                continue;
            }
            res++;
            visited[i][j] = true;
            queue.add(new int[]{i+1, j, (i+1)%10 == 0 ? si-8 : si+1, sj});
            queue.add(new int[]{i, j+1, si, (j+1)%10 == 0 ? sj-8 : sj+1});
        }

        return res;
    }
}
