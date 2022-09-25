package io.github.jiangdequan;

public class sqrtBinaryPrecision {
    public static void main(String[] args) {
        int p = 3;
        int n = 47;
       System.out.println(sqrt(n,p));
       //sqrt(n,p);
    }

    static double sqrt(int n, int p){
        int start =0;
        int end = n;
        double root = 0.0;
        int mid = 0;
        while(start<=end){
            mid = start +(end-start)/2;
            if(mid * mid == n){
                return mid;
            }
            if(mid*mid< n){
                start = mid+1;
                root = mid;    
            }
            else{
                end = mid-1;
                
            }
        }
    
        double incr = 0.1;
        for(int i =0;i<=p;i++){
            while(root * root <=n){
                root += incr;
            }
            root -= incr;
            incr /=10;
        }
        return root;
    }
}
