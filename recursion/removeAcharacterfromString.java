public class recursionSubset {
    public static void main(String[] args) {
        skip("", "bccaaddhn");
        System.out.println(skip("aabbaaccaaddeezz"));
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
}
