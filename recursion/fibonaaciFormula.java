public class fibonacciFormula {
    public static void main(String[] args) {
        // for(int i =0;i<50;i++){
        //     System.out.println(fibonacci(i));
        // }
        System.out.println(fibonacci(50));
        System.out.println(longFibo(50));
    }
    public static double fibonacci(int n){
       return ((Math.pow(((1+Math.sqrt(5))/2),n) /Math.sqrt(5)));
    }

    public static double longFibo(int n){
        return ((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
