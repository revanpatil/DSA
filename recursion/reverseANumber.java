// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    static int sum = 0;
    public static void main(String[] args) {
        
        reverseNumber(5432);
        System.out.println(sum);
    }
    
    static void reverseNumber(int number){
        
        if(number == 0){
            return;
        }
        sum = sum*10 + number%10;
        reverseNumber(number/10);
    }
}
