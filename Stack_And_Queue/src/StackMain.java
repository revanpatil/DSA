public class StackMain  {
    public static void main(String[] args) throws Exception {
        CustomStack cs = new DyncamicStack(5);
        cs.push(15);
        cs.push(11);
        cs.push(10);
        cs.push(12);
        cs.push(7);
        cs.push(4);

        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
    }
}
