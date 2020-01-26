import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(6);
        pq.add(-3);
        pq.add(20);
        pq.add(10);
        // 不按从小到大输出是因为toString方法
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
