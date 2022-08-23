import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class disappearedMissingNumber {
        public static void main(String[] args){
            int arr[] = new int[]{4,3,2,7,8,2,3,1};
            System.out.println(missingNumber(arr));
        }
        public static List<Integer> missingNumber(int nums[]){
            int i =0;
            while(i<nums.length){
                int current = nums[i]-1;
                if(nums[i] !=current){
                    swap(nums,i,current);
                }
                else{ 
                i++;
                }
                
            }
            List<Integer>ans = new ArrayList<>();
                for(int index=0;index<nums.length;index++){
                    if(nums[index]!=index+1){
                        ans.add(index+1);
                    }
                    
                }
            return ans;
        }
        public static void swap(int nums[],int first,int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
