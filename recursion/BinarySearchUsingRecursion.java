package io.github.jiangdequan;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[] = new int []{1,3,5,77,99};
        int target = 77;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    public static int search(int arr[],int target,int start,int end){
        
        if(start>end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr, target, start, mid-1);
        }
        
            return search(arr, target, mid+1, end);
        
    }
}