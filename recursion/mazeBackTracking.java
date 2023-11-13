package io.github.jiangdequan;

import java.util.Arrays;

public class mazeBackTracking {
    public static void main(String[] args) {
        boolean maze[][] = {{true,true,true},
            {true,true,true},
            {true,true,true}};

       // allPath("",maze,0,0);

        int path[][] = new int[maze.length][maze[0].length];
        allPathsPrint("",maze,0,0,path,1);
    }

    static void allPath(String p, boolean maze[][], int r, int c){
        if(r == maze.length-1  &&  c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
            allPath(p + "D",maze,r+1,c);
        }

        if(c<maze[0].length-1){
            allPath(p + "R", maze,r,c+1);
        }

        if(r > 0){
            allPath(p + "U",maze,r-1,c);
        }

        if(c>0){
            allPath(p + "L",maze,r,c-1);
        }

        //this is where function will be over
        // So before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void allPathsPrint(String p, boolean maze[][],int r, int c, int path[][], int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
           for(int arr[] : path){
               System.out.println(Arrays.toString(arr));
           }

            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            allPathsPrint(p + "D", maze,r+1,c,path,step+1);
        }

        if(c< maze[0].length-1){
            allPathsPrint(p+"R", maze, r, c+1,path,step+1);
        }

        if(r > 0){
            allPathsPrint(p + "U", maze, r-1,c,path,step+1);
        }

        if(c > 0){
            allPathsPrint(p + "L",maze,r,c-1,path,step+1);
        }

        path[r][c] = 0;
        maze[r][c] = true;
    }
}
