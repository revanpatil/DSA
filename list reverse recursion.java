import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
class Main
{
    public static<String> void reverseList(List<String> list)
    {
        if (list == null || list.size() <= 1) {
            return;
        }
        String value = list.remove(0);
 
        reverseList(list);
        list.add(value);
    }
 
    public static void main(String[] args)
    {
        List<String> colors = new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));
 
        reverseList(colors);
        System.out.println(colors);
    }
}
