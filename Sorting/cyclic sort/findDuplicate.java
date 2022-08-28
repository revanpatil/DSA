import java.util.Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,2,2};
       // findDuplicate(arr);
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums){
        int i =0;
        while(i<nums.length){
            if(nums[i]!=i+1){  // check this conditon first
                int correctIndex = nums[i]-1;  // correct index for that particular i
                if(nums[i]!= nums[correctIndex]){  // rat le 
                    swap(nums,i,correctIndex);
                }
                else{
                    return nums[i];
                }
            }
            
            else{
                i++;
            }
        }
        return -1;
    }
    public static void swap(int nums[],int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
