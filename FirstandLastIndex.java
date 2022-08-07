/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]*/
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int a[] = new int[]{1,7,7,8,8,10};
        System.out.println(Arrays.toString(searchEngine(a,8)));
    }
    static int[] searchEngine(int arr[], int target){
        int ans[] = {-1,-1};
        ans[0] = binarySearch(arr,target,true);
        ans[1] = binarySearch(arr,target,false);
        return ans;
        
    }
    public static int binarySearch(int arr[], int target, boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(startIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
                
            }
        }
        return ans;
    }
}
