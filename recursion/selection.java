package io.github.jiangdequan;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int arr[] = {4,2,3,1};
        sort(arr, arr.length-1, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[], int r, int c,int max){

        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                sort(arr, r, c,c+1);
            }
            else{
                sort(arr, r, c,c+1);
            } 
        }
        else{
            int temp = arr[max];
            arr[r-1] = arr[max];
            arr[r-1] = temp;
        }
    }  

}