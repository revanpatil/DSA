public class CircularMain {
    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue(5);
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        cq.insert(50);

        cq.display();
        System.out.println(cq.remove());
        cq.display();

    }
}
