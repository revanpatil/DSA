public class isPrime {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1;i<=n;i++){
            System.out.println(i + " " + isPrime(i));
        }
    }
    public static boolean isPrime(int n){
        while(n<=1){
            return true;
        }
        int c =2;
        while(c*c <=n){
            if(n%c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}