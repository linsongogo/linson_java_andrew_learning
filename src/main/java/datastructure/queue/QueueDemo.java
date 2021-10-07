package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(1);//在使用容量受限的队列时，“offer”通常比“add”更合适，后者只能通过抛出异常来插入元素。
    queue.offer(2);
    queue.add(3);

    System.out.println(queue);//[1, 2, 3]

    System.out.println(queue.poll());//1; pull 检索并删除该队列的头部，如果该队列为空则返回null。
    System.out.println(queue);//[2, 3]

    System.out.println(queue.peek());//2; peel 检索但不删除该队列的头部，如果该队列为空则返回null。
    System.out.println(queue);//[2, 3]
  }
}
