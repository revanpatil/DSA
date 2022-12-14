import java.util.Arrays;

public class LeetCodeOrderQueue {
    public String orderlyQueue(String s, int k) {
        if(k>1){
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            return new String(tempArray);
        } else {
            String ans  = s;
            for(int i=0;i< s.length(); i++){
                s = s.substring(1) + s.substring(0,1);
                if(ans.compareTo(s) >0){
                    System.out.println(ans.compareTo(s));
                    ans = s;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        LeetCodeOrderQueue qu = new LeetCodeOrderQueue();
        System.out.println(qu.orderlyQueue("baacalmncopqaabchsdsds",2));
    }
}
