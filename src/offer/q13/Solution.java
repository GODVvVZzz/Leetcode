package offer.q13;

/**
 * @author HP
 * @date 2022/3/25
 * 这题好难
 * DFS
 */
public class Solution {

    int m, n, k;
    boolean[][] visited = new boolean[m][n];
    public int movingCount(int m, int n, int k) {

        this.m = m;
        this.n = n;
        this.k = k;

        return dfs(0, 0, 0, 0);
    }

    int dfs(int i, int j, int si, int sj){
        if(i > m-1 || j > n-1 || si+sj > k || visited[i][j]){
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i, j+1, si, (j+1)%10 == 0 ? sj-8 : sj+1) +
                dfs(i+1, j, (i+1)%10 ==0 ? si-8 : si+1, sj);
    }
}
