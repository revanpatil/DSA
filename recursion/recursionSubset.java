public class recursionSubset {
    public static void main(String[] args) {
        skip("", "bccaaddhn");
        System.out.println(skip("aabbaaccaaddeezz"));
        System.out.println(skipApple("ccddapplepoy"));
        System.out.println(skipAppNotApple("ccddapplcpoy"));
    }

    public static void skip(String p, String up){
        if(up.isEmpty() ==  true){
            System.out.println(p);
            return;
        }

        char ch =  up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p + ch,up.substring(1));
        }

    }

    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char c = up.charAt(0);

        if(c == 'a'){
            return skip(up.substring(1));
        }
        else{
            return c + skip(up.substring(1));
        }
    }

    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
           return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    public static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
