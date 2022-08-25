
public class ArrangingCoins {

	public static void main(String[] args) {
		/*
		 * You have n coins and you want to build a staircase with these coins. The
		 * staircase consists of k rows where the ith row has exactly i coins. The last
		 * row of the staircase may be incomplete.
		 * 
		 * Given the integer n, return the number of complete rows of the staircase you
		 * will build.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * 
		 * Input: n = 5 Output: 2 Explanation: Because the 3rd row is incomplete, we
		 * return 2. Example 2:
		 * 
		 * 
		 * Input: n = 8 Output: 3 Explanation: Because the 4th row is incomplete, we
		 * return 3.
		 */
	}

	public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
		
        long sum = n;
        
        
        while(start<=end){
            long mid = start +(end-start)/2;
            long temp = mid*(mid+1)/2;
            if(temp == sum){
                return (int)mid;
            }
            else if(temp<sum){
                start = mid+1;
            }
            else if(temp>sum){
                end = mid-1;
            }
        }
        return (int)end;
    }
}


