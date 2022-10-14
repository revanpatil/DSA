// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.

 

// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:

// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.


//Link : https://leetcode.com/problems/sort-the-people/


class Solution {
    public String[] sortPeople(String[] names, int[] heights) { 
        for(int i =0 ;i< heights.length;i++){
            int last = heights.length - i -1;
            int maxIndex = getMaxIndex(heights,0,last);
            swap(heights,maxIndex,last);
            swap(names,maxIndex,last);
        }
        return names;
        
    }
    
    static int getMaxIndex(int arr[], int start, int end){
        int max =  start;
        for(int i= start;i<=end;i++){
            if(arr[max] > arr[i]){
                max = i;
            }
        }
        return max;
    }
    
    static void swap(int arr[] ,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    static void swap(String arr[] ,int first, int second){
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
