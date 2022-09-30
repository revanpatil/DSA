public class countNumberOfZero {
    public static void main(String[] args) {
        System.out.println(zero(10203040));
    }

    static int zero(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, count+1);
        }
            return helper(n/10,count);
        
    }
}
