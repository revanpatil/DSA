public class contains {
    public static void main(String[] args) {
        int length = 8;
        String [] arr = {"apple", "apples", "applesorangeapples", "orange", "orangeapplesorange", "pomegranet", "mango", "mangoappleorangeapple"};

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if((i != j) && arr[i].contains(arr[j])){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
