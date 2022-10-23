/*
** Selection Sort:
Find a max element in the array and replace it with the last index
    Find second max and replace it with second last ...
    
    or
    
Find a min element in the array and replace it with first index 
    Find second min and replace with second index ...
 * Complexity: Best Case = Worst Case = O(n^2)
 * Works well for small lists/arrays
 */



import java.util.Arrays;

public class selectionSort {
    static void selectionSort(int arr[]){
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxIndex(int arr[],int start, int end){
        int max = start;
        for(int i =0;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int arr[], int first,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;

    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,10,40,20,32};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
