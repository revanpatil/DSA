import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int a[] = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(numbers[start]+numbers[end] != target){
            int sum = numbers[start] + numbers[end];
             if(sum < target ){
                start++;
            }
            else{
                end--;
            }
        }
       return new int[]{start+1,end+1};
    }
}



