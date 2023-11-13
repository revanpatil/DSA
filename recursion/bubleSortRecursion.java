package io.github.jiangdequan;

import java.util.Arrays;

public class bubleSortRecursion {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,4,6};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[], int r, int c){

        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
            swap(arr, c, c+1);
            }   
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
    }

    static void swap(int arr[], int first,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    
    }
}