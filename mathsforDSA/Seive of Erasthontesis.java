public class Seive {
    public static void main(String[] args) {
        int n =40;
        boolean [] prime = new boolean[n+1];
        seive(n,prime);
    }
    public static void seive(int n,boolean isPrime[]){
        for(int i =2;i*i<=n;i++){
            if(!isPrime[i]){
                for(int j =2*i;j<=n;j+=i){
                    isPrime[j] = true;
                }
            }
        }

        for(int i = 2;i<=n;i++){
            if(!isPrime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
