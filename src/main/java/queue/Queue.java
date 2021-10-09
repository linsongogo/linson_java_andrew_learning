package queue;

import java.util.LinkedList;

public class Queue {

  public static void main(String[] args) {
    java.util.Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < 5; i++) {
      queue.offer(i);
    }
    System.out.println(queue); // [0, 1, 2, 3, 4]

    queue.remove();
    System.out.println("After remove:" + queue); // [ 1, 2, 3, 4]
    System.out.println("peek: " + queue.peek()); // 1
    System.out.println("size: " + queue.size()); // 4

    queue.clear();
    System.out.println("After clear size: " + queue); // []

    //int  r = queue.poll();
    //System.out.println(r); // Exception 队列为空Null

    //queue.remove(); //NoSuchElementException extends RuntimeException 无需捕获
  }
}
