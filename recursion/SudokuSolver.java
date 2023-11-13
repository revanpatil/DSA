package io.github.jiangdequan;

public class SudokuSolver {
    public static void main(String[] args) {
        int board[][] = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve(board)){
            display(board);
        }else{
            System.out.println("Can't Solve");
        }
    }

    private static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing r,c from arguments
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){  //check if cell is empty if empty assign row and col and break the loop and check isSafe call below.
                    row = i;
                    col = j;
                    emptyLeft = false;  // once you get the element in cell to be empty set it as false
                    break;
                }
            }

            if(emptyLeft == false){
                break;
            }
        }

        if(emptyLeft == true){
            return true;
            // sudoku is solved
        }

        for (int number = 1; number <=9 ; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col] = number;
                if(solve(board)){
                    return true;
                    //sudoku is solved
                }else{
                    //backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void display(int board[][]){
        for(int[]row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    private static boolean isSafe(int[][] board, int row, int col, int number) {
        //check the row

        for (int i = 0; i < board.length ; i++) {
            if(board[row][i] == number){
                return false;
            }
        }

        for (int i = 0; i < board.length ; i++) {
            if(board[i][col] == number){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int i = rowStart; i < rowStart + sqrt ; i++) {
            for (int j = colStart; j < colStart + sqrt ; j++) {
                if(board[i][j] == number){
                    return false;
                }
            }
        }
        return true;
    }

}
