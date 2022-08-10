public class sqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(16));
		System.out.println(mySqrt(8));

	}
	     static int mySqrt(int x) {
	        int start = 1;
	        int end = x;
	        long mid =0;
	        while(start<=end){
	            mid = start +(end-start)/2;
	            if(mid*mid == x){
	                return (int)mid;
	            }
	            if(mid*mid < x){
	            	start = (int)mid +1;
	                
	            }
	            else {
	            	end = (int)mid-1;
	            }
	        }
	        return (int)end;
	}
	
}
