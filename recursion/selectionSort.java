package io.github.jiangdequan;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {4,2,3,1};
        //sort(arr, arr.length-1, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int arr[], int r, int c,int max){

        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr, r, c,c+1);
            }
            else{
                selection(arr, r, c,c+1);
            } 
        }
        else{
            int temp = arr[max];
            arr[r-1] = arr[max];
            arr[r-1] = temp;
        }
    }  
}