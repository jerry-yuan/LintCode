package lintcode.q389;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
    public boolean isValidSudoku(char[][] board) {
        // write your code here
        Set<Character> existed=new HashSet<>();
        // check every line
        for (int i = 0; i < 9; i++) {
            existed.clear();
            for (int j = 0; j < 9; j++) {
                if(board[i][j]=='.'){
                    continue;
                }
                if(existed.contains(board[i][j])){
                    return false;
                }
                existed.add(board[i][j]);
            }
        }

        // check every row
        for (int i = 0; i < 9; i++) {
            existed.clear();
            for (int j = 0; j < 9; j++) {
                if(board[j][i]=='.'){
                    continue;
                }
                if(existed.contains(board[j][i])){
                    return false;
                }
                existed.add(board[j][i]);
            }
        }
        // check every block
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                existed.clear();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if(board[i*3+k][j*3+l]=='.'){
                            continue;
                        }
                        if(existed.contains(board[i*3+k][j*3+l])){
                            return false;
                        }
                        existed.add(board[i*3+k][j*3+l]);
                    }
                }
            }
        }
        return true;
    }
}
