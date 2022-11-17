public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue cq = new DynamicQueue(4);
        cq.insert(5);
        cq.insert(10);
        cq.insert(15);
        cq.insert(20);
        cq.insert(25);
        cq.insert(30);
        cq.insert(30);
        cq.display();
        cq.remove();
        System.out.println(cq.front());
        cq.display();
    }
}
