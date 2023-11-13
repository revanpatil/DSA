package io.github.jiangdequan;

import java.util.ArrayList;

public class backTracking {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        countPath("",3,3);
//        System.out.println(mazePath("",4,4));
//        diagonalMaze("",3,3);

        boolean board[][] = {{true,true,true},
                        {true, false, true},
                        {true,true,true}};
        obstacleMaze("",board,0,0);
    }

    public static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count (r, c-1);

        return left + right;
    }

    public static void countPath(String p,int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r>1){
            countPath(p+ "D",r-1,c);
        }
        if(c>1){
            countPath(p+ "R",r,c-1);
        }
    }

    public static ArrayList<String> mazePath(String p, int r, int c){
        if(r==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r >1){
            list.addAll(mazePath(p+'D',r-1,c));
        }

        if(c>1){
            list.addAll(mazePath(p+"R",r,c-1));
        }

        return list;
    }

    public static void diagonalMaze(String p, int r, int c){
        if(r ==1 && c == 1){
            System.out.println(p);
        }

        if(r>1){
            diagonalMaze(p+'V',r-1,c);
        }

        if(c>1){
            diagonalMaze(p+'H',r,c-1);
        }

        if(r>1 && c >1){
            diagonalMaze(p +'D',r-1, c-1);
        }
    }

    public static void obstacleMaze(String p ,boolean board[][],int r, int c) {
        if(r==board.length-1 && c== board[0].length-1){
            System.out.println(p);
        }

        if(!board[r][c]){
            return;
        }
        if(r< board.length-1){
            obstacleMaze(p + "D",board, r+1,c);
        }

        if(c<board[0].length-1){
            obstacleMaze(p+ "R",board , r,c+1);
        }
    }

}
