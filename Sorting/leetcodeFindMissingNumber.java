//https://leetcode.com/problems/missing-number/
//Amazon Question

public class findMissingNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int current = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[current]){
                swap(nums,i,current);
            }
            else{
                i++;
            }
        }

        for(int index =0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }      
        }
        return nums.length;
    }

    static void swap(int nums[],int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
