public class bitwiseOdd {
    public static void main(String[] args) {
        System.out.println(checkOdd(198755413));
    }

    static String checkOdd(int num){
        num = num & 1;
        if(num == 1){
            return "odd";
        }
        else{
            return "even";
        }
        
    }
}
