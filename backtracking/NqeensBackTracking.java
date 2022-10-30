package io.github.jiangdequan;

import java.util.ArrayList;
import java.util.List;

public class nQueensBackTracking {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean board[][] = new boolean[n][n];
        List<List<String>> list = new ArrayList<>();
        queens(board,0,list);
        return list;
    }

    public static void queens(boolean board[][], int row , List<List<String>> answer ){
            if(row == board.length){
                answer.add(insert(board));
                return;
            }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row+1, answer);
                board[row][col] = false;
            }
        }

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // for vertical
        for (int i = 0; i < row ; i++) {
            if(board[i][col]){
                return false;
            }
        }
        // for left diagonal
        int leftMax = Math.min(row, col);
        for (int i = 1; i <=leftMax ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        // for right diagonal
        int rightMax = Math.min(row, board.length-col-1);
        for (int i = 1; i <=rightMax ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static List<String> insert(boolean[][] board) {
        List<String> list = new ArrayList<>();
            for(boolean[] row : board){
                String s = "";
                for(boolean element : row){
                    if(element){
                        s= s+"Q";
                    }
                    else{
                        s= s+ ".";
                    }
                }
                list.add(s);
            }
            return list;
    }
}
