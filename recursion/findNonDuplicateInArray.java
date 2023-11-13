package io.github.jiangdequan;

public class findNonDuplicateInArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,3,2,1};
        System.out.println(nonDuplicateXOR(nums));
    }

    public static int nonDuplicateXOR(int nums[]){
        int value = 0;
        for(int i = 0;i<nums.length;i++){
            value = value ^nums[i] ;
        }
        return value;
    }
        
}