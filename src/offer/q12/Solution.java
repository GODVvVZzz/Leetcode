package offer.q12;

/**
 * @author HP
 * @date 2022/3/25
 */
public class Solution {

    public boolean exist(char[][] board, String word) {

        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] borad, char[] words, int i, int j, int k){
        if(i < 0 || i >= borad.length || j < 0 || j >= borad[0].length || borad[i][j] != words[k]){
            return false;
        }
        if(k == words.length - 1){
            return true;
        }
        borad[i][j] = '\0';
        boolean res = (dfs(borad,words,i - 1,j,k + 1)||dfs(borad,words,i + 1,j,k + 1)
                ||dfs(borad,words,i,j - 1,k + 1)||dfs(borad,words,i,j + 1,k + 1));
        borad[i][j] = words[k];
        return res;
    }
}
