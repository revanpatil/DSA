//https://leetcode.com/problems/contains-duplicate/?envType=study-plan&id=programming-skills-i

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(binarySearch(nums,nums[i],i+1,nums.length-1) == true){
                return true;
            }
        }
        return false;
        
    }
    
    public static boolean binarySearch(int nums[], int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
